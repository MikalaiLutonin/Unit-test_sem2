
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void initialization() {
        car = new Car("Acura", "MDX", 2015);
        motorcycle = new Motorcycle("Honda", "CBR 1000", 2014);
    }

    @Test
    void isAnInstanceOfAVehicle() {
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    @Test
    void carHasFourWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void motorcycleHasTwoWheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    void carReachesASpeedOfSixtyInTestDrive() {
        car.testDrive();
        assertEquals(60, car.getSpeed(), 0.00001);
    }

    @Test
    void motorcycleReachesASpeedOfSeventyFiveInTestDrive() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed(), 0.00001);
    }

    @Test
    void carStopsInParkingMode() {
        carReachesASpeedOfSixtyInTestDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    void motorcycleStopsInParkingMode() {
        motorcycleReachesASpeedOfSeventyFiveInTestDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}