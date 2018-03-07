package logic;

import java.util.Set;
import java.util.HashSet;

public class Bus
{
    private Long busId;
    private String number;
    private Set drivers = new HashSet();
    private Long routeId;

    public Bus()
    {
    }

    public void setBusId(Long busId)
    {
        this.busId = busId;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public void setDrivers(Set drivers)
    {
        this.drivers = drivers;
    }

    public void setRouteId(Long routeId)
    {
        this.routeId = routeId;
    }

    public Long getBusId()
    {
        return busId;
    }

    public String getNumber()
    {
        return number;
    }

    public Set getDrivers()
    {
        return drivers;
    }

    public Long getRouteId()
    {
        return routeId;
    }
}