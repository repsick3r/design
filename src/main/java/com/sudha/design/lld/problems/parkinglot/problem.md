    Requirements
    
    Extensibility:
    - types of vehicles -> car, bus, bike..
    - each parking spot supports one type of vehicle
    - charging method maybe eventbased, timebased...
    - payment method maybe UPI, cash, cards...
    
    Dynamic:
    - has multiple parking levels and slots per floor
    - number of gates (many entry and exit)
    - ticket will be used to calculate cost at exit gate

    Concurreny:
    - are we building for one lot / multiple -> single
    - each parking slot should be occupied by only one vehicle

<br>

    Entities
    
    Vehicle : Vehicle, VehicleType
    Parking : Floor, Spot, SpotType
    Gate    : EntryGate, ExitGate 
    Ticket  : Ticket, PricingStrategy
    Payment : PaymentStrategy
    
    
    
    

    