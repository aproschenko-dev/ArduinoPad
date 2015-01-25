package com.dev.aproschenko.arduinocontroller;

import android.bluetooth.BluetoothDevice;
import android.os.ParcelUuid;

import java.util.ArrayList;

public class DeviceData
{
    private String name = "";
    private String customName = "";
    private String address = "";
    private int bondState = BluetoothDevice.BOND_NONE;
    private ArrayList<ParcelUuid> uuids = null;
    private int deviceClass;
    private int majorDeviceClass;

    public DeviceData(BluetoothDevice device, String emptyName)
    {
        name = device.getName();
        address = device.getAddress();
        bondState = device.getBondState();

        if (name == null || name.isEmpty())
            name = emptyName;

        deviceClass = device.getBluetoothClass().getDeviceClass();
        majorDeviceClass = device.getBluetoothClass().getMajorDeviceClass();

        uuids = BluetoothUtils.getDeviceUuids(device);
    }

    public int getDeviceClass()
    {
        return deviceClass;
    }

    public int getMajorDeviceClass()
    {
        return majorDeviceClass;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String deviceName)
    {
        name = deviceName;
    }

    public void setBondState(int state)
    {
        bondState = state;
    }

    public String getAddress()
    {
        return address;
    }

    public ArrayList<ParcelUuid> getUuids()
    {
        return uuids;
    }

    public int getBondState()
    {
        return bondState;
    }

    public String getCustomName()
    {
        return customName;
    }

    public void setCustomName(String deviceCustomName)
    {
        customName = deviceCustomName;
    }
}
