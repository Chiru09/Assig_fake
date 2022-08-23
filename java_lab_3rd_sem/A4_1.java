import java.util.*;

class Bus
{
    int regdNo;
    String model;
    int capacity;

    public void showBusDetails()
    {
        System.out.println("Bus Details: RegdNo = " + regdNo + ", Model = " + model + ", Capacity = " + capacity);
    }

}

class PublicBus extends Bus
{
    String owner;
    String from;
    String to;
    String deptTime;
    String arrivalTime;

    public void showBusDetails()
    {
        System.out.println("Bus Details: RegdNo = " + regdNo + ", Model = " + model + ", Capacity = " + capacity);

        System.out.println("Owner = " + owner);
        System.out.println("From = " + from);
        System.out.println("To = " + to);
        System.out.println("Departure Time = " + deptTime);
        System.out.println("Arrival Time = " + arrivalTime);

    }

}

class LuxuryPublicBus extends PublicBus
{
    boolean isAC;
    boolean isWifi;
    int noOfSleeperSeat;

    public void showBusDetails()
    {
        System.out.println("Bus Details: RegdNo = " + regdNo + ", Model = " + model + ", Capacity = " + capacity);

        System.out.println("Owner = " + owner);
        System.out.println("From = " + from);
        System.out.println("To = " + to);
        System.out.println("Departure Time = " + deptTime);
        System.out.println("Arrival Time = " + arrivalTime);

        System.out.println("Is Ac available = " + isAC);
        System.out.println("Is Wifi available = " + isWifi);
        System.out.println("Is no of sleeper seats available = " + noOfSleeperSeat);
    }

    public void setDetalis(int regdNo, String  model, int capacity, String owner, String from, String to, String deptTime, String arrivalTime, boolean isAC, boolean isWifi, int noOfSleeperSeat)
    {
        this.regdNo = regdNo;
        this.model = model;
        this.capacity = capacity;
        this.owner = owner;
        this.from = from;
        this.to = to;
        this.deptTime = deptTime;
        this.arrivalTime = arrivalTime;
        this.isAC = isAC;
        this.isWifi = isWifi;
        this.noOfSleeperSeat = noOfSleeperSeat;
    }
}


class A4_1 {
    public static void main(String[] args)
    {
        int regdNo,capacity,noOfSleeperSeat;
        String owner,from,to,deptTime,arrivalTime,model;
        boolean isAC,isWifi;
        int val_bool;

        Scanner data = new Scanner(System.in);
        System.out.println("Bus Details : ");

        System.out.println("Registration no of the bus: ");
        regdNo = data.nextInt();

        System.out.println("Capasity of the bus : ");
        capacity = data.nextInt();

        System.out.println("Model of the bus : ");
        model = data.next();

        System.out.println("Owner of the bus : ");
        owner = data.next();

        System.out.println("From : ");
        from = data.next();

        System.out.println("To : ");
        to = data.next();

        System.out.println("Departure time of the bus : ");
        deptTime = data.next();

        System.out.println("Arrival time of thge bus");
        arrivalTime = data.next();

        System.out.println("Is AC available : ");
        val_bool = data.nextInt();
        if(val_bool==1)
            isAC = true;
        else
            isAC = false;

        System.out.println("Is Wifi available = ");
        val_bool = data.nextInt();
        if(val_bool==1)
            isWifi = true;
        else
            isWifi = false;

        System.out.println("No of the sleeper seats available : ");
        noOfSleeperSeat = data.nextInt();

        LuxuryPublicBus l1 = new LuxuryPublicBus();
        l1.setDetalis(regdNo, model, capacity, owner, from, to, deptTime, arrivalTime, isAC, isWifi, noOfSleeperSeat);
        l1.showBusDetails();
    }
}
