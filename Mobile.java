package assignment3;

import java.util.Scanner;

//interface IMobile{
//	public void dial();
//}
//interface ITelephone{
//	public void dial();
//}
public class Mobile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long IEMICode;
		String isSingleSIM;
		String Processor;
		String SIMCard;
		long MobileNo;
		// IMobile im = ()->System.out.println("mobile method");
		// ITelephone it = ()->System.out.println("telephone method");
		// im.dial();
		// it.dial();
		System.out.println("------enter the mobile company-------- ");
		System.out.println("          1 . Samsung");
		System.out.println("          2 . Nokia");
		System.out.println("          3 . IPhone");
		int choice = sc.nextInt();
		// IEMICode = sc.nextLong();
		// Processor = sc.nextInt();
		// SIMCard = sc.next();
		// MobileNo = sc.nextLong();
		switch (choice) {
		case 1:
			Samsung sam = new Samsung();
			System.out.println("SAMSUNG");
			System.out.println("IEMI code for Samsung is " + sam.getIEMICode(547863524));
			System.out.println("Mobile number for Samsung is " + sam.getMobileNo(9985376052));
			System.out.println("Sim card type is " + sam.isIsSingleSIM("Singlesim"));
			System.out.println("Processors for Samsung is " + sam.getProcessor("Quad core"));
			System.out.println("Sim name  is " + sam.getSIMCard("Airtel"));
			sam.ConnectBlueTooth();
			sam.Dial();
			sam.GetWIFIConnection();
			sam.Receive();
			sam.SendMessage();
			break;
		case 2:
			Nokia nok = new Nokia();
			System.out.println("IEMI code for Nokia is" + nok.getIEMICode(8537412696));
			System.out.println("Sim card type is " + nok.isIsSingleSIM("No, Dual sim"));
			System.out.println("Processors for Nokia is " + nok.getProcessor("Quadcore"));
			System.out.println("Sim card name is " + nok.getSIMCard("Reliance"));
			System.out.println("Mobile number is " + nok.getMobileNo(6300797186L));
			nok.ConnectBlueTooth();
			nok.Dial();
			nok.GetWIFIConnection();
			nok.Receive();
			nok.SendMessage();
			break;
		case 3:
			IPhone ip = new IPhone();
			System.out.println("IEMI code is Apple is " + ip.getIEMICode(54871245685L));
			System.out.println("Sim card type is " + ip.isIsSingleSIM(" Single sim"));
			System.out.println("Processors For Apple  is  " + ip.getProcessor("Octa core"));
			System.out.println("Sim card name is " + ip.getSIMCard("Idea"));
			System.out.println("Mobile number is " + ip.getMobileNo(9836247214L));
			ip.ConnectBlueTooth();
			ip.Dial();
			ip.GetWIFIConnection();
			ip.Receive();
			ip.SendMessage();
			break;
		default:
			System.out.println("enter a choice in range");
		}
	}

}
