package DataStructureAlgorithm;

public class DynamicArray
{
	int size;
	int capacity = 10;
	Object[] array;
	int count = 0;
	
	/*
	 * Default Capacity
	 */
	public DynamicArray()
	{
		this.array = new Object[capacity];
	}
	
	/*
	 * User Declared Capacity
	 */
	public DynamicArray(int capacity)
	{
		this.capacity = capacity;
		this.array = new Object[capacity];
	}
	
	public void add(Object data)
	{
		if(size >= capacity)
		{
			grow();
		}
		array[size] = data;
		size++;
	}
	
	public void insert(int index, Object data)
	{
		if(size >= capacity)
		{
			grow();
		}
		else
		{
			for(int i = size; i > index; i--)
			{
				array[i] = array[i-1];
			}
			array[index] = data;
			size++;
		}
	}
	
	public void remove(Object data)
	{
		for(int i = 0; i < size; i++)
		{
			if(array[i] == data)
			{
				for(int j = 0; j < (size - i - 1); j++)
				{
					array[i + j] = array[i + j + 1];
				}
				array[size-1] = null;
				size--;
				if(size <= (int)(capacity/3))
				{
					shrink();
				}
			}
		}
	}
	
	public int search(Object data)
	{
		for(int i = 0; i < size; i++)
		{
			if(array[i] == data)
			{
				return i;
			}
		}
		return -1;
	}
	
	private void grow()
	{
		int newCapacity = (int)(capacity * 2);
		Object[] newArray = new Object[newCapacity];
		for (int i = 0; i < size; i++)
		{
			newArray[i] = array[i];
		}
		capacity = newCapacity;
		array = newArray;
	}
	
	private void shrink()
	{
		int newCapacity = (int)(capacity / 2);
		Object[] newArray = new Object[newCapacity];
		for (int i = 0; i < size; i++)
		{
			newArray[i] = array[i];
		}
		capacity = newCapacity;
		array = newArray;
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	public String toString()
	{
		String string = "";
		for(int i=0; i < size; i++)
		{
			string = string + array[i] + ", ";
		}
		
		// to remove the ", " after last element
		if(string != "")
		{
			string = "[" +  string.substring(0, string.length()-2) + "]";
		}
		else
		{
			string = "[]";
		}
		return string;
	}
	

}
