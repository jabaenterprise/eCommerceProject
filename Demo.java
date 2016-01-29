import java.io.IOException;

import components.CPU;
import components.Case;
import components.GPU;
import components.HardDrive;
import components.Monitor;
import components.MotherBoard;
import components.RAM;
import exceptions.NotEnoughInStockExceptio;
import factories.ClientFactory;
import shop.DataBase;
import user.Address;

public class Demo {

	public static void main(String[] args) throws NotEnoughInStockExceptio {
		DataBase dataBase = new DataBase();
		dataBase.getInventory().generateArray();
		
		Case case1= new Case("x2", "alianWare", 125, "the best there is", "midTower", "45\"");
		Case case2= new Case("x1", "alianWare", 200, "the best there is", "midTower", "50\"");
		Case case3= new Case("x1", "alianWare", 200, "the best there is", "midTower", "50\"");
		CPU cpu1 = new CPU("CORE i7", "intel", 450, "very fast and reliable", 8, 2.4, "some kind of socket");
		CPU cpu2 = new CPU("CORE i5", "intel", 300, "fast and reliable", 6, 2, "some other kind of socket");
		CPU cpu3 = new CPU("FX", "AMD ", 455, "very fast and reliable", 8, 2.8, "some AMD kind of socket");
		GPU gpu1 = new GPU("GTX 980 TI", "NVIDIA", 560, "Ti. The most powerful two letters in the world of GPUs. When paired with our flagship gaming GPU – GeForce GTX 980 – it enables new levels of performance and capabilities. Accelerated by the groundbreaking NVIDIA Maxwell™ architecture, GTX 980 Ti delivers an unbeatable 4K and virtual reality experience.", 6, "5120x3200", "Dual Link DVI-I, HDMI 2.0, 3x DisplayPort 1.2");
		GPU gpu2 = new GPU("R9 390X 8G D5", "ATi", 620, "The SAPPHIRE R9 390X Series is based on the latest Graphics Core Next architecture from AMD and is designed to provide enthusiast level graphics performance.", 5, "4096X2160", "1 x DVI-D 1 x HDMI 3 x DisplayPort");
		HardDrive hD1 = new HardDrive("Barracuda ","Seagate" , 75, "16MB, SATA3", "HDD", 4, 500);
		HardDrive hD2 = new HardDrive("535 Series ","Intel " , 150, "SATA3", "SSD", 4, 240);
		HardDrive hD3 = new HardDrive("Blue ","WD " , 60, "64MB, SATA3", "HDD", 4, 500);
		Monitor monitor1 = new Monitor("VE228HR", "Asus ", 180, "SPLENDID Video Auto Adjustment Brightness Adjustment", 21, 5, "LED");
		Monitor monitor2 = new Monitor("V226HQLBBD", "Acer  ", 120, "HDCP support", 21, 5, "TN");
		Monitor monitor3 = new Monitor("23MB35PM", "LG  ", 200, "Reader Mode HDCP", 23, 5, "IPS ");
		RAM ram1 = new RAM("HyperX Savage", "Kingston ", 100, "Dual channel 1600MHz", "DDR3", 8);
		RAM ram2 = new RAM("JetRam ", "Transcend  ", 28, "Dual channel 1600MHz", "DDR3", 4);
		RAM ram3 = new RAM("ValueRAM ", "Kingston ", 30, "Single channel 2133MHz", "DDR4", 4);
		MotherBoard mB1 = new MotherBoard("N3050M-E", "Asus " , 90, "ASUS 5X Protection ASUS Exclusive Features ASUS EZ DIY ASUS Q-Design", "Intel", "2", "1170");
		MotherBoard mB2 = new MotherBoard(" Z97X-Gaming G1", "Gigabyte  " , 400, "2 x 128 MB Flash PnP DMI 2.7 WfM 2.0 SM BIOS 2.7 ACPI 5.0", "Intel", "2", "1150");
		dataBase.addComponent(gpu2, 6);
		dataBase.addComponent(gpu1, 6);
		dataBase.addComponent(cpu3, 12);
		dataBase.addComponent(cpu2, 9);
		dataBase.addComponent(cpu1, 14);
		dataBase.addComponent(mB1, 21);
		dataBase.addComponent(mB1, 31);
		dataBase.addComponent(ram3, 12);
		dataBase.addComponent(ram2, 32);
		dataBase.addComponent(ram1, 14);
		dataBase.addComponent(monitor3, 54);
		dataBase.addComponent(monitor2, 12);
		dataBase.addComponent(monitor1, 22);
		
		dataBase.addComponent(hD3, 13);
		dataBase.addComponent(hD3, 14);
		dataBase.addComponent(hD2, 15);
		dataBase.addComponent(hD1, 21);
		dataBase.addComponent(case3, 22);
		dataBase.addComponent(case2, 31);
		dataBase.addComponent(case1, 22);
		dataBase.addComponent(7);
	
		dataBase.showAllComponents();
	System.out.println("----------------------------");
		
		
		dataBase.registerClient("Gosho", "A123a", "itt@itt.com");
		dataBase.registerClient("Gosho", "A123a", "itt@itt.com");
		try {
			dataBase.getClients().get(0).getCart().addProduct(gpu2, 1);
		} catch (NotEnoughInStockExceptio e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dataBase.getClients().get(0).getCart().addProduct(monitor2, 0);
		} catch (NotEnoughInStockExceptio e) {
			
		}
		System.out.println("----------------------------");
		dataBase.getClients().get(0).getCart().printCart();
		System.out.println("----------------------------");
//		dataBase.printInventoryContent();
		dataBase.getClients().get(0).buyProducts();
		dataBase.getClients().get(0).setAddress(new Address("georgi", "Sofia","Address 1","address 2", "1000", "288996258"));
		dataBase.getClients().get(0).buyProducts();
	}

}
