```mermaid
classDiagram
class Vehicle {
    +int speed
    +String color
    +displayInfo() void
    +move() void
}
class Car {
    +int doors
    +displayInfo() void
    +move() void
}
class Motorcycle {
    +boolean hasSidecar
    +displayInfo() void
    +move() void
}
class Person {
    +String name
    +int age
    +performDuty() void
}
class Driver {
    +String licenseNumber
    +performDuty() void
    +operate() void
}
class Mechanic {
    +int experience
    +performDuty() void
    +performMaintenance() void
}
class ServiceStation {
    +String stationName
    +openStation() void
    +performMaintenance() void
    +operate() void
}
class VehicleUtils {
    +static int maxSpeed
    +inspect(Vehicle vehicle) void
    +calculateEfficiency() void
}

class Operable {
    <<interface>>
    +operate() void
}

class Maintainable {
    <<interface>>
    +performMaintenance() void
}

Vehicle <|-- Car
Vehicle <|-- Motorcycle
Person <|-- Driver
Person <|-- Mechanic
Driver ..|> Operable
Mechanic ..|> Maintainable
ServiceStation ..|> Maintainable
ServiceStation ..|> Operable
