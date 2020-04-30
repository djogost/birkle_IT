package org.example.test

import org.example.DAO.VehicleDAO
import org.example.model.VehicleEntity
import org.example.service.VehicleService
import spock.lang.Specification
import java.time.LocalDate

class VehicleServiceTest extends Specification {

    def fixture
    def mockVehicleDAO
    def testVehicleList
    def testVehicleNew
    def testVehicleNewUpdate
    VehicleEntity testVehicle= new VehicleEntity();

    def setup() {
        mockVehicleDAO = Mock(VehicleDAO.class)
        fixture = new VehicleService();
        testVehicleNew = new VehicleEntity(3," BMW 4", "Sports Car","D", "RA KL 1234", "LR11SW61R021197119", LocalDate.now(), "3166-2" );
        testVehicleNewUpdate = new VehicleEntity(104," BMW 1", "Sports Car","D", "RA KL 1234", "UK11SW61R021197119", LocalDate.now(), "Germany" );

        testVehicleList = new ArrayList<>();
        testVehicleList.add(testVehicle);
        testVehicleList.add(testVehicle);
        testVehicleList.add(testVehicle);
    }

    def "Create vehicle with valid fields"() {
        when:
        fixture.addVehicle(testVehicle)
        then:
        mockVehicleDAO.addVehicle(testVehicle)
    }

    /*def "Delete vehicle with valid id"() {
        when:
        fixture.deleteVehicle(testVehicleNew.getId())
        then:
        mockVehicleDAO.deleteVehicle(testVehicleNew.getId()) >> 1
    }*/


    def "Get vehicle with valid id"() {
        when:
        fixture.getVehicle(testVehicleNew.getId())
        then:
        mockVehicleDAO.getVehicle(testVehicleNew.getId()) >> testVehicle
    }

    /*def "Update vehicle with valid ID"() {
        when:
        fixture.updateVehicle(testVehicleNew,testVehicleNew.getId())
        then:
        mockVehicleDAO.updateVehicle(testVehicleNewUpdate) >> 1
    }*/

    def "Get collection of all vehicle"() {
        when:
        fixture.getVehicles()
        then:
        mockVehicleDAO.getAdvisors() >> testVehicleList
    }

}
