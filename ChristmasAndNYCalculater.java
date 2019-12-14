/*
		Copyright [2019] [Mohammed Albasha]

		Licensed under the Apache License, Version 2.0 (the "License");
		you may not use this file except in compliance with the License.
		You may obtain a copy of the License at

			http://www.apache.org/licenses/LICENSE-2.0

		Unless required by applicable law or agreed to in writing, software
		distributed under the License is distributed on an "AS IS" BASIS,
		WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		See the License for the specific language governing permissions and
		limitations under the License.
*/

import java.time.*;
import java.util.*;

class ChristmasAndNYCalculater {
	public static void main(String[] args) {
		
		int[] christamses = new int[7];
		int[] nys = new int[7];
		
		
		for(int i = 0; i < 2020; i++){
			String day = getCH_Day(i);
			
			if(day.equals("MON")){
				christamses[0] = christamses[0] + 1;
			}else if (day.equals("TUE")) {
				christamses[1] = christamses[1] + 1;
			}else if (day.equals("WED")) {
				christamses[2] = christamses[2] + 1;
			}else if (day.equals("THU")) {
				christamses[3] = christamses[3] + 1;
			}else if (day.equals("FRI")) {
				christamses[4] = christamses[4] + 1;
			}else if (day.equals("SAT")) {
				christamses[5] = christamses[5] + 1;
			}else if (day.equals("SUN")) {
				christamses[6] = christamses[6] + 1;
			}
			
		}
		
		for(int i = 0; i < 2020; i++){
			String day = getNY_Day(i);
			
			if(day.equals("MON")){
				nys[0] = nys[0] + 1;
			}else if (day.equals("TUE")) {
				nys[1] = nys[1] + 1;
			}else if (day.equals("WED")) {
				nys[2] = nys[2] + 1;
			}else if (day.equals("THU")) {
				nys[3] = nys[3] + 1;
			}else if (day.equals("FRI")) {
				nys[4] = nys[4] + 1;
			}else if (day.equals("SAT")) {
				nys[5] = nys[5] + 1;
			}else if (day.equals("SUN")) {
				nys[6] = nys[6] + 1;
			}
			
		}
		
		String output = "************************************************************************************************\n"
		              + "*                                                                                              *\n"
					  + "* ------------------ |  MON   |   TUE   |   WED   |   THU   |   FRI   |   SAT   |   SUN        *\n"
					  + "*                                                                                              *\n"
					  + "*     Christmas      |  " + christamses[0] + "   |   " + christamses[1] + "   |   " + christamses[2] + "   |   " + christamses[3] + "   |   " + christamses[4] + "   |   " + christamses[5] + "   |   " + christamses[6] + "        *\n"
					  + "*     New Year       |  " + nys[0] + "   |   " + nys[1] + "   |   " + nys[2] + "   |   " + nys[3] + "   |   " + nys[4] + "   |   " + nys[5] + "   |   " + nys[6] + "        *\n"
					  + "*                                                                                              *\n"
					  + "************************************************************************************************\n";
		System.out.println(output);
	}
	
	static public String getCH_Day(int n){
		String date = new GregorianCalendar(2019 - n, Calendar.DECEMBER, 25).getTime().toString();
		return date.substring(0,3).toUpperCase();
	}
	
	static public String getNY_Day(int n){
		String date = new GregorianCalendar(2019  - n, Calendar.JANUARY, 1).getTime().toString();
		return date.substring(0,3).toUpperCase();
	}
}
