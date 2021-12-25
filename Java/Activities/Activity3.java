package activities;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double seconds = 1000000000;
		double earthseconds = 31557600;
		double mercuryseconds = 0.2408467;
		double venusseconds = 0.61519726;
		double marsseconds = 1.8808158;
		double jupiterseconds = 11.862615;
		double saturnseconds = 29.447498;
		double uranusseconds = 84.016846;
		double neptuneseconds = 164.79132;
		System.out.println("User has said that their age was"+seconds+"seconds old, so their ");
		System.out.println("Age on Mercury is : " +seconds/earthseconds/mercuryseconds);
		System.out.println("Age on Venus is : " +seconds/earthseconds/venusseconds);
		System.out.println("Age on Earth is : " +seconds/earthseconds);
		System.out.println("Age on Mars is : " +seconds/earthseconds/marsseconds);
		System.out.println("Age on Jupiter is : " +seconds/earthseconds/jupiterseconds);
		System.out.println("Age on Saturn is : " +seconds/earthseconds/saturnseconds);
		System.out.println("Age on Uranus is : " +seconds/earthseconds/uranusseconds);
		System.out.println("Age on Neptune is : " +seconds/earthseconds/neptuneseconds);
			}

}

