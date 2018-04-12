package com.assignment_2;
import com.assignment_2.*;

import java.util.HashMap;
import java.util.Map;

public class Person extends Account_Runner
{
	String[] name = new String[2];
	float[] age = new float[] {32.0f,26.0f};
	
	void acc_assoc()
	{
		name[0] = "Smith";
		name[1] = "Katherine";
	
		Account_Runner ar1 = new Account_Runner();
		
		Map<long[],String> keyval = new HashMap<long[],String>();

        for(int  i = 0 ; i < name.length ; i++ )
        {
            keyval.put(ar1.accNum[i], name[i]);
        }
	}
}
