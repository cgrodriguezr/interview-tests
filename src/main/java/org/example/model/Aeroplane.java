package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Aeroplane {

    private final List<Passenger> passengers = new ArrayList<>();

    public String enter(Passenger passenger)
    {
        throw new UnsupportedOperationException ("Add passenger to passengers list");
        // throw new UnsupportedOperationException ("Print passenger description if it is not null");
        // throw new UnsupportedOperationException ("Print a welcome message for each passenger type, see unit test shouldAddPassengerOnEnter for expected message");
        // Add the passenger to the passengers list
    }
 
    public List<Passenger> bulkEnter(Passenger... passenger)
    {
        throw new UnsupportedOperationException ("Implement method that executes enter(passenger) for each passenger and return all as list");
        // 1. Create a list to store the passengers that entered the aeroplane
        // 2. Iterate through the given passengers and call enter(passenger) for each passenger
        // 3. Add the passenger to the list created in step 1
        // 4. Return the list created in step 1
    }

    public boolean exit(UUID passengerId)
    {
        throw new UnsupportedOperationException ("Should remove passenger from passenger list returning true on success otherwise false");
        // 1. Iterate through the passenger list and find the passenger with the given id
        // 2. If the passenger is found, remove the passenger from the list and return true
        // 3. If the passenger is not found, return false 
    }

    public int countPassengers()
    {
        throw new UnsupportedOperationException ("count passengers in passenger list");
        // Return the size of the passenger list
        // Note: We can also iterate through the passenger list and count the number of passengers, but it is more efficient to return the size of the list
    }

    public int countPassengersByType(PassengerType passengerType)
    {
        throw new UnsupportedOperationException ("count passengers of given passenger type in passenger list");
        // 1. Create a hash map based on passanger type
        // 2. Count the number of passagers for each type
        // 3. return the count for the given passenger type
        // Note: step 2 and 3 can be done in one step by iterating through the passenger list and counting the number of passengers of the given type 
        // but I prefer to separate the counting and returning steps for better readability and maintainability of the code
    }

    public Map<PassengerType, Passenger> mapPassengersByType()
    {
        throw new UnsupportedOperationException ("Convert passenger list to a map keyed by passenger type. If any two elements would have the same key, then the last one gets added to the map");
        // 1. Create a hash map to store the passengers keyed by passenger type
        // 2. Iterate through the passenger list and add each passenger to the hash map using the passenger type as the key
        // 3. Return the hash map created in step 1
        // Note: A similar procedure is repeated in the countPassengerByType method, we can reuse the code by calling countPassengerByType method 
        // for each passenger type and adding the result to the hash map created in step 1
    }

    public List<Passenger> orderPassengersByFare()
    {
        throw new UnsupportedOperationException ("Return a list of all passengers (from passengers list) sorted in ascending order of fare price");
        // 1. Create a new list to store the sorted passengers 
        // 2. Sort the passenger list using the Quicksort algorithm based on the fare price of the passengers and store the result in the list created in step 1
        // 3. Return the list created in step 1
    }

    public double totalFare()
    {
        throw new UnsupportedOperationException ("Return the sum of all passenger fare prices");
        // 1. Create a variable to store the total fare and initialize it to 0 (data type should be long log or equivalent to avoid overflow)
        // 2. Iterate through the passenger list and add the fare price of each passenger to the total fare variable
        // 3. Return the total fare variable
    }
}
