package sistemadevagasdeestacionamento

class User {
    //#if($ParkingSpaceBooking)
    String username
    String firstName
    String lastName
    String preferredSector
    String preferential

    static constraints = {
        username nullable: false, blank: false, unique: true
        firstName nullable: false, blank: false
        lastName nullable: false, blank: false
        preferredSector inList: ["CIn", "CCEN", "Área II"]
        preferential inList: ["CIn", "CCEN", "Área II"]
    }
    //#end
}
