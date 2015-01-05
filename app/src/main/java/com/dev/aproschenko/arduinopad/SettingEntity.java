package com.dev.aproschenko.arduinopad;

import com.dev.aproschenko.arduinopad.MainActivity.SortType;

import java.util.ArrayList;

public class SettingEntity
{
	private ArrayList<DeviceData> devices = new ArrayList<DeviceData>();
	private MainActivity.SortType sortType = SortType.SORT_BY_NAME;

	public ArrayList<DeviceData> getDevices()
	{
		return devices;
	}

	public void setSortType(MainActivity.SortType value)
	{
		sortType = value;
	}

	public MainActivity.SortType getSortType()
	{
		return sortType;
	}
}
