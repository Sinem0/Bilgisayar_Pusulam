public class Monster extends HazirBilgisayarSec{

    private String monsterSeriAd;
    private String monsterBilgisayarAd;
    private float monsterFiyat;


    Monster(Kullanici kullanici, String marka)
    {
        super(kullanici,marka);

    }

    @Override
    void MarkaninBilgisayarSerileri() {


        int seriSec=0;
        System.out.println(" ------MONSTER Serileri------ ");
        System.out.println("1- ABRA Serisi");
        System.out.println("2- TULPAR Serisi");
        System.out.println("3- SEMRUK Serisi");
        System.out.println("4- HUMA Serisi");
        System.out.print("Seciminiz : ");
        seriSec = scanner.nextInt();

        while(seriSec <1 || seriSec>4)
        {
            System.out.print("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin :");
            seriSec = scanner.nextInt();
        }


        switch (seriSec)
        {
            default:
            case 1:
                setMonsterSeriAd("ABRA");
                setMarkaSeriAd("ABRA");
                setMarka("Monster");
                int abraSec=0;
                System.out.println("1-) Abra A7 V14.2 17,3 - Gaming Laptop");
                System.out.println("2-) Abra A5 V17.2.1 15,6 - Gaming Laptop");
                System.out.print("Seciminiz : ");
                abraSec = scanner.nextInt();

                try {
                    if (abraSec==1)
                    {
                        setMonsterBilgisayarAd("Abra A7 V14.2 17,3\" Oyun BilgisayarÄ±");
                        setMonsterFiyat(22699.00F);

                        setMarkaBilgisayarAd("Abra A7 V14.2 17,3\" Oyun BilgisayarÄ±");
                        setMarkaBilgisayarFiyat(22699.00F);

                    }
                    else if(abraSec==2)
                    {
                        setMonsterBilgisayarAd("Abra A5 V17.2.1 15,6\" Gaming Laptop");
                        setMonsterFiyat(20099.00F);

                        setMarkaBilgisayarAd("Abra A5 V17.2.1 15,6\" Gaming Laptop");
                        setMarkaBilgisayarFiyat(20099.00F);

                    }
                    else {
                        throw new Exception("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin : ");
                    }
                }
                catch(Exception hata) {
                    System.out.println();
                    System.out.println(hata.getMessage());
                    System.out.println("");
                    MarkaninBilgisayarSerileri();

                }

                break;



            case 2: //TULPAR();
                setMonsterSeriAd("TULPAR");
                setMarkaSeriAd("TULPAR");
                setMarka("Monster");
                int tulparSec=0;
                System.out.println("1-) Tulpar T7 V20.5 17,3 - Gaming Laptop");
                System.out.println("2-) Tulpar T7 V20.5.6 17,3 - Gaming Laptop");
                System.out.println("3-) Tulpar T7 V21.9 17,3 - Gaming Laptop");
                System.out.print("Seciminiz : ");
                tulparSec = scanner.nextInt();

                try {
                    if (tulparSec==1)
                    {
                        setMonsterBilgisayarAd("Tulpar T7 V20.5 17,3 - Gaming Laptop");
                        setMonsterFiyat(27899.00F);

                        setMarkaBilgisayarAd("Tulpar T7 V20.5 17,3 - Gaming Laptop");
                        setMarkaBilgisayarFiyat(27899.00F);

                    }
                    else if(tulparSec==2)
                    {
                        setMonsterBilgisayarAd("Tulpar T7 V20.5.6 17,3 - Gaming Laptop");
                        setMonsterFiyat(31299.00F);

                        setMarkaBilgisayarAd("Tulpar T7 V20.5.6 17,3 - Gaming Laptop");
                        setMarkaBilgisayarFiyat(31299.00F);
                    }
                    else if(tulparSec==3)
                    {
                        setMonsterBilgisayarAd("Tulpar T7 V21.9 17,3 - Gaming Laptop");
                        setMonsterFiyat(42999.00F);

                        setMarkaBilgisayarAd("Tulpar T7 V21.9 17,3 - Gaming Laptop");
                        setMarkaBilgisayarFiyat(42999.00F);
                    }
                    else {
                        throw new Exception("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin : ");
                    }
                }
                catch(Exception hata) {
                    System.out.println();
                    System.out.println(hata.getMessage());
                    System.out.println("");
                    MarkaninBilgisayarSerileri();

                }

                break;




            case 3:// SEMRUK();
                setMonsterSeriAd("SEMRUK");
                setMarkaSeriAd("SEMRUK");
                setMarka("Monster");
                int semrukSec=0;
                System.out.println("1-) Semruk S7 V8.1.2 17,3 - Gaming Laptop");
                System.out.println("2-) Semruk S7 V8.1.1 17,3 - Gaming Laptop");
                System.out.println("3-) Semruk S7 V8.1.3 17,3 - Gaming Laptop");
                System.out.print("Seciminiz : ");
                semrukSec=scanner.nextInt();
                try {
                    if (semrukSec==1)
                    {
                        setMonsterBilgisayarAd("Semruk S7 V8.1.2 17,3 - Gaming Laptop");
                        setMonsterFiyat(149999.00F);

                        setMarkaBilgisayarAd("Semruk S7 V8.1.2 17,3 - Gaming Laptop");
                        setMarkaBilgisayarFiyat(149999.00F);

                    }
                    else if(semrukSec==2)
                    {
                        setMonsterBilgisayarAd("Semruk S7 V8.1.1 17,3 - Gaming Laptop");
                        setMonsterFiyat(89999.00F);

                        setMarkaBilgisayarAd("Semruk S7 V8.1.1 17,3 - Gaming Laptop");
                        setMarkaBilgisayarFiyat(89999.00F);
                    }
                    else if(semrukSec==3)
                    {
                        setMonsterBilgisayarAd("Semruk S7 V8.1.3 17,3 - Gaming Laptop");
                        setMonsterFiyat(79999.00F);

                        setMarkaBilgisayarAd("Semruk S7 V8.1.3 17,3 - Gaming Laptop");
                        setMarkaBilgisayarFiyat(79999.00F);
                    }
                    else {
                        throw new Exception("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin : ");
                    }
                }
                catch(Exception hata) {
                    System.out.println();
                    System.out.println(hata.getMessage());
                    System.out.println("");
                    MarkaninBilgisayarSerileri();

                }

                break;
            case 4: //HUMA();
                setMonsterSeriAd("HUMA");
                setMarkaSeriAd("HUMA");
                setMarka("Monster");
                int humaSec=0;
                System.out.println("1-) Huma H4 V4.1.1 14,1 - Business Computer");
                System.out.println("2-) Huma H4 V4.1 14,1 - Business Computer");
                System.out.println("3-) Huma H5 V3.1.1 15,6 - Business Computer");
                System.out.println("4-) Huma H5 V3.2.1 15,6 - Business Computer");
                System.out.print("Seciminiz : ");
                humaSec=scanner.nextInt();

                try {
                    if (humaSec==1)
                    {
                        setMonsterBilgisayarAd("Huma H4 V4.1.1 14,1 - Business Computer");
                        setMonsterFiyat(25999.00F);

                        setMarkaBilgisayarAd("Huma H4 V4.1.1 14,1 - Business Computer");
                        setMarkaBilgisayarFiyat(25999.00F);

                    }
                    else if(humaSec==2)
                    {
                        setMonsterBilgisayarAd("Huma H4 V4.1 14,1 - Business Computer");
                        setMonsterFiyat(20499.00F);

                        setMarkaBilgisayarAd("Huma H4 V4.1 14,1 - Business Computer");
                        setMarkaBilgisayarFiyat(20499.00F);
                    }
                    else if(humaSec==3)
                    {
                        setMonsterBilgisayarAd("Huma H5 V3.1.1 15,6 - Business Computer");
                        setMonsterFiyat(16599.00F);

                        setMarkaBilgisayarAd("Huma H5 V3.1.1 15,6 - Business Computer");
                        setMarkaBilgisayarFiyat(16599.00F);
                    }
                    else if(humaSec==4)
                    {
                        setMonsterBilgisayarAd("Huma H5 V3.2.1 15,6 - Business Computer");
                        setMonsterFiyat(18399.00F);

                        setMarkaBilgisayarAd("Huma H5 V3.2.1 15,6 - Business Computer");
                        setMarkaBilgisayarFiyat(18399.00F);
                    }
                    else {
                        throw new Exception("Hatali Giris Degeri! Lutfen tanimlanan secenklerlerden birini secin : ");
                    }
                }
                catch(Exception hata) {
                    System.out.println();
                    System.out.println(hata.getMessage());
                    System.out.println("");
                    MarkaninBilgisayarSerileri();

                }
                break;
        }

    }



    @Override
    void TeknikBilgi() {

        if(getMonsterSeriAd().equalsIgnoreCase("ABRA"))
        {
            if( getMonsterBilgisayarAd().equals("Abra A7 V14.2 17,3 - Gaming Laptop"))
            {
                System.out.println("\n");

                System.out.println("Teknik Ozellikleri : ");
                System.out.println("IntelÂ® Alder Lake Coreâ¢ i5-12500H 12C/16T; 18MB L3; E-CORE Max 3.30GHZ P-CORE Max 4.5GHZ;45W ;10nm SuperFin\n" +
                        "4 GB RTX 3050 Ti 128-Bit Max-P 80Watt + 15 Watt DB 2.0\n" +
                        "17,3\" FHD 1920x1080 144Hz IPS Mat LED Ekran\n" +
                        "8GB (1x8GB) DDR4 1.2V 3200MHz SODIMM\n" +
                        "500GB PCIe M.2 2280 3.0 x4\n" +
                        "FreeDos (Ä°Åletim sistemi bulunmamaktadÄ±r.\n" +
                        "2 Adet Disk DesteÄi (2x M.2 SSD)\n" +
                        "RGB Tek BÃ¶lge AydÄ±nlatmalÄ± Klavye\n" +
                        "24,9mm KalÄ±nlÄ±k\n" +
                        "2,5kg AÄÄ±rlÄ±k\n" +
                        "GÃ¼Ã§lendirilmiÅ Plastik Kasa YapÄ±sÄ±");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            if ( getMonsterBilgisayarAd().equals("Abra A5 V17.2.1 15,6 - Gaming Laptop"))
            {
                System.out.println("\n-------------------------------------------------------------------------------");
                System.out.println("Teknik Ozellikleri : ");
                System.out.println("IntelÂ® Tiger Lake Coreâ¢ i5-11400H 6C/12T; 12MB L3; 8GT/s; 2.7GHz > 4.5GHz; 45W; 10nm SuperFin\n" +
                        "Windows 11 Home Single Language\n" +
                        "Nvidia RTX3050 TI Max-Performance 4GB GDDR6 128-Bit DX12\n" +
                        "15,6\" FHD 1920x1080 144Hz AHVA Mat LED Ekran\n" +
                        "16GB (2x8GB) DDR4 1.2V 3200MHz SODIMM\n" +
                        "500GB PCIe M.2 2280 3.0 x4\n" +
                        "3 Adet Disk DesteÄi (2x M.2 SSD + 1x 2.5\" Disk)\n" +
                        "RGB Tek BÃ¶lge AydÄ±nlatmalÄ± Klavye\n" +
                        "24,9mm KalÄ±nlÄ±k\n" +
                        "2,2kg AÄÄ±rlÄ±k\n" +
                        "AlÃ¼minyum Ä°le GÃ¼Ã§lendirilmiÅ Kasa");
                System.out.println("\n-------------------------------------------------------------------------------");

            }

        } else if (getMonsterSeriAd().equalsIgnoreCase("TULPAR"))
        {
            if( getMonsterBilgisayarAd().equals("Tulpar T7 V20.5 17,3 - Gaming Laptop")) {
                System.out.println("");

                System.out.println("-------------------Teknik Ãzellikleri-----------------");

                System.out.println("");

                System.out.println("â¢IntelÂ® Alder Lake Coreâ¢ i7-12700H 14C/20T; 24MB L3; E-CORE Max 3.50GHZ P-CORE Max 4.7GHZ;45W ;10nm SuperFin\r\n"
                        + "â¢ Nvidia RTX3060 Max-Performance 6GB GDDR6 192-Bit\r\n"
                        + "â¢ 17,3\" FHD 1920x1080 144Hz IPS Mat LED Ekran\r\n"
                        + "â¢ 16GB (2x8GB) DDR4 3200MHz\r\n"
                        + "â¢ 512GB SAMSUNG PM991A M.2 SSD PCIe 3.0 x4\r\n"
                        + "â¢ FreeDos (Ä°Åletim sistemi bulunmamaktadÄ±r)\r\n"
                        + "â¢ 2 Adet Disk DesteÄi (2x M.2 SSD)\r\n"
                        + "â¢ RGB Tek BÃ¶lge AydÄ±nlatmalÄ± Klavye (TÃ¼rkÃ§e Q)\r\n"
                        + "â¢ 30,05mm KalÄ±nlÄ±k\r\n"
                        + "â¢ 2,5kg AÄÄ±rlÄ±k\r\n"
                        + "â¢ GÃ¼Ã§lendirilmiÅ Plastik Kasa\r\n");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if( getMonsterBilgisayarAd().equals("Tulpar T7 V20.5.6 17,3 - Gaming Laptop")) {
                System.out.println("");

                System.out.println("-------------------Teknik Ãzellikleri-----------------");
                System.out.println("");

                System.out.println("â¢ IntelÂ® Alder Lake Coreâ¢ i7-12700H 14C/20T; 24MB L3; E-CORE Max 3.50GHZ P-CORE Max 4.7GHZ;45W ;10nm SuperFin\r\n"
                        + "â¢ Nvidia RTX3060 Max-Performance 6GB GDDR6 192-Bit\r\n"
                        + "â¢ 17,3\" FHD 1920x1080 144Hz IPS Mat LED Ekran\r\n"
                        + "â¢ 32GB (2x16GB) DDR4 3200MHz\r\n"
                        + "â¢ 1TB PCIe M.2 2280 3.0 x4\r\n"
                        + "â¢ FreeDos (Ä°Åletim sistemi bulunmamaktadÄ±r)\r\n"
                        + "â¢ 2 Adet Disk DesteÄi (2x M.2 SSD)\r\n"
                        + "â¢ RGB Tek BÃ¶lge AydÄ±nlatmalÄ± Klavye (TÃ¼rkÃ§e Q)\r\n"
                        + "â¢ 30,05mm KalÄ±nlÄ±k\r\n"
                        + "â¢ 2,5kg AÄÄ±rlÄ±k\r\n"
                        + "â¢ GÃ¼Ã§lendirilmiÅ Plastik Kasa\r\n");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if( getMonsterBilgisayarAd().equals("Tulpar T7 V21.9 17,3 - Gaming Laptop")) {
                System.out.println("");

                System.out.println("-------------------Teknik Ãzellikleri-----------------");
                System.out.println("");

                System.out.println("â¢ IntelÂ® Alder Lake Coreâ¢ i7-12700H 14C/20T; 24MB L3; E-CORE Max 3.50GHZ P-CORE Max 4.7GHZ;45W ;10nm SuperFin\r\n"
                        + "â¢ 8 GB RTX 3070Ti 256 Bit Max-P 125 Watt + 25Watt DB 2.0\r\n"
                        + "â¢ 17,3\" QHD 2560x1440 165Hz IPS Mat LED Ekran\r\n"
                        + "â¢ 16GB (2x8GB) DDR5 4800MHz\r\n"
                        + "â¢ 512GB SAMSUNG PM991A M.2 SSD PCIe 3.0 x4\r\n"
                        + "â¢ FreeDos (Ä°Åletim sistemi bulunmamaktadÄ±r.)\r\n"
                        + "â¢ 2 Adet Disk DesteÄi (2x M.2 SSD)\r\n"
                        + "â¢ RGB 4 BÃ¶lge AydÄ±nlatmalÄ± Klavye (TÃ¼rkÃ§e Q)\r\n"
                        + "â¢ 20mm KalÄ±nlÄ±k\r\n"
                        + "â¢ 2,3kg AÄÄ±rlÄ±k\r\n"
                        + "â¢ Magnezyum Kasa");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
        }else if (getMonsterSeriAd().equalsIgnoreCase("SEMRUK"))
        {
            if(getMonsterBilgisayarAd().equals("Semruk S7 V8.1.2 17,3 - Gaming Laptop")) {
                System.out.println("");

                System.out.println("-------------------Teknik Ãzellikleri-----------------");
                System.out.println("");

                System.out.println("â¢ Intel Rocket Lake Coreâ¢ i9-11900K 8C/16T; 16MB L3; 8GT/s; 3.5GHz>5.3GHz; 125W; 14nm\r\n"
                        + "â¢ Windows 11 Pro\r\n"
                        + "â¢ Nvidia RTX3080 Max-Performance 16GB GDDR6 256-Bit\r\n"
                        + "â¢ 17,3\" UHD 3840x2160 %100 Adobe RGB IPS Mat LED Ekran\r\n"
                        + "â¢ 128GB (4x32GB) DDR4 1.2V 2933MHz\r\n"
                        + "â¢ 3x 2TB SAMSUNG PM9A1 M.2 SATA NVME SSD\r\n"
                        + "â¢ 4 Adet Disk DesteÄi (4x M.2 SSD)\r\n"
                        + "â¢ ÃzelleÅtirilebilir RGB AydÄ±nlatmalÄ± Klavye\r\n"
                        + "â¢ 43.5mm Ä°ncelik\r\n"
                        + "â¢ 4,5 Kg AÄÄ±rlÄ±k\r\n");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if(getMonsterBilgisayarAd().equals("Semruk S7 V8.1.1 17,3 - Gaming Laptop")) {
                System.out.println("");

                System.out.println("-------------------Teknik Ãzellikleri-----------------");
                System.out.println("");

                System.out.println("â¢ Intel Rocket Lake Coreâ¢ i9-11900K 8C/16T; 16MB L3; 8GT/s; 3.5GHz > 5.3GHz; 125W; 14nm\r\n"
                        + "â¢ Windows 11 Pro\r\n"
                        + "â¢ Nvidia RTX3080 Max-Performance 16GB GDDR6 256-Bit\r\n"
                        + "â¢ 17,3\" UHD 3840x2160 %100 Adobe RGB IPS Mat LED Ekran\r\n"
                        + "â¢ 32GB (2x16GB) DDR4 1.2V 3200MHz\r\n"
                        + "â¢ 1TB PCIe M.2 2280 3.0 x4\r\n"
                        + "â¢ 4 Adet Disk DesteÄi (4x M.2 SSD)\r\n"
                        + "â¢ ÃzelleÅtirilebilir RGB AydÄ±nlatmalÄ± Klavye\r\n"
                        + "â¢ 43.5mm Ä°ncelik\r\n"
                        + "â¢ 4,5 Kg AÄÄ±rlÄ±k");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if(getMonsterBilgisayarAd().equals("Semruk S7 V8.1.3 17,3 - Gaming Laptop")) {
                System.out.println("");

                System.out.println("-------------------Teknik Ãzellikleri-----------------");
                System.out.println("");

                System.out.println("â¢ Intel Rocket Lake Coreâ¢ i9-11900K 8C/16T; 16MB L3; 8GT/s; 3.5GHz > 5.3GHz; 125W; 14nm\r\n"
                        + "â¢ Windows 11 Pro\r\n"
                        + "â¢ Nvidia RTX3080 Max-Performance 16GB GDDR6 256-Bit\r\n"
                        + "â¢ 17,3\" QHD 2560x1440 165Hz %100 sRGB IPS Mat LED Ekran\r\n"
                        + "â¢ 32GB (2x16GB) DDR4 1.2V 3200MHz\r\n"
                        + "â¢ 1TB PCIe M.2 2280 3.0 x4\r\n"
                        + "â¢ 4 Adet Disk DesteÄi (4x M.2 SSD)\r\n"
                        + "â¢ ÃzelleÅtirilebilir RGB AydÄ±nlatmalÄ± Klavye\r\n"
                        + "â¢ 43.5mm Ä°ncelik\r\n"
                        + "â¢ 4,5 Kg AÄÄ±rlÄ±k\r\n");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
        }else if (getMonsterSeriAd().equalsIgnoreCase("HUMA"))
        {
            if(getMonsterBilgisayarAd().equals("Huma H4 V4.1.1 14,1 - Business Computer")) {
                System.out.println("");

                System.out.println("-------------------Teknik Ãzellikleri-----------------");
                System.out.println("");

                System.out.println("â¢ Intel i7-1165G7-2,8GHz Turbo Boost ile 4,7GHz\r\n"
                        + "â¢ Windows 11 Home Single Language\r\n"
                        + "â¢ IntelÂ® IrisÂ® Xe Graphics (96 YÃ¼rÃ¼tme Birimi)\r\n"
                        + "â¢ 14,1\" FHD 1920x1200 %100 sRGB IPS Mat LED Ekran\r\n"
                        + "â¢ 32GB (2x16GB) DDR4 3200MHz\r\n"
                        + "â¢ 1TB PCIe M.2 2280 3.0 x4\r\n"
                        + "â¢ 2 Adet Disk DesteÄi (2x M.2 SSD)\r\n"
                        + "â¢ Beyaz Arka AydÄ±nlatmalÄ± Klavye\r\n"
                        + "â¢ 13-15mm Ä°ncelik\r\n"
                        + "â¢ 0.99Kg AÄÄ±rlÄ±k\r\n"
                        + "â¢ Magnezyum");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if(getMonsterBilgisayarAd().equals("Huma H4 V4.1 14,1 - Business Computer")) {
                System.out.println("");

                System.out.println("-------------------Teknik Ãzellikleri-----------------");
                System.out.println("");

                System.out.println("â¢ Intel i7-1165G7-2,8GHz Turbo Boost ile 4,7GHz\r\n"
                        + "â¢ IntelÂ® IrisÂ® Xe Graphics (96 YÃ¼rÃ¼tme Birimi)\r\n"
                        + "â¢ 14,1\" FHD 1920x1200 %100 sRGB IPS Mat LED Ekran\r\n"
                        + "â¢ 16GB (2x8GB) DDR4 3200MHz\r\n"
                        + "â¢ 512GB SAMSUNG PM991A M.2 SSD PCIe 3.0 x4\r\n"
                        + "â¢ FreeDos (Ä°Åletim sistemi bulunmamaktadÄ±r)\r\n"
                        + "â¢ 2 Adet Disk DesteÄi (2x M.2 SSD)\r\n"
                        + "â¢ Beyaz Arka AydÄ±nlatmalÄ± Klavye\r\n"
                        + "â¢ 13-15mm Ä°ncelik\r\n"
                        + "â¢ 0.99Kg AÄÄ±rlÄ±k");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if(getMonsterBilgisayarAd().equals("Huma H5 V3.1.1 15,6 - Business Computer")) {
                System.out.println("");

                System.out.println("-------------------Teknik Ãzellikleri-----------------");
                System.out.println("");

                System.out.println("â¢ Intel i5-1135G7 4C/8T; 8MB L3; 4GT/s; 2,4 GHz > 4.2GHz; 28W; 10nm\r\n"
                        + "â¢ Windows 11 Home Single Language\r\n"
                        + "â¢ IntelÂ® IrisÂ® Xe Graphics (80 YÃ¼rÃ¼tme Birimi)\r\n"
                        + "â¢ 15,6\" FHD 1920x1080 165Hz IPS Mat LED Ekran\r\n"
                        + "â¢ 16GB (2x8GB) DDR4 3200MHz\r\n"
                        + "â¢ 1TB PCIe M.2 2280 3.0 x4\r\n"
                        + "â¢ Beyaz Arka AydÄ±nlatmalÄ± Klavye\r\n"
                        + "â¢ 16,7mm Ä°ncelik\r\n"
                        + "â¢ 1.7Kg AÄÄ±rlÄ±k");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
            else if(getMonsterBilgisayarAd().equals("Huma H5 V3.2.1 15,6 - Business Computer")) {
                System.out.println("");

                System.out.println("-------------------Teknik Ãzellikleri-----------------");
                System.out.println("");

                System.out.println("â¢ Intel i7-1165G7 4C/8T; 12MB L3; 4GT/s; 2,8 GHz > 4.7GHz; 28W; 10nm\r\n"
                        + "â¢ Windows 11 Home Single Language\r\n"
                        + "â¢ IntelÂ® IrisÂ® Xe Graphics (96 YÃ¼rÃ¼tme Birimi)\r\n"
                        + "â¢ 15,6\" FHD 1920x1080 144Hz IPS Mat LED Ekran\r\n"
                        + "â¢ 16GB (2x8GB) DDR4 1.2 3200MHz\r\n"
                        + "â¢ 1TB PCIe M.2 2280 3.0 x4\r\n"
                        + "â¢ Beyaz Arka AydÄ±nlatmalÄ± Klavye\r\n"
                        + "â¢ 16,7mm Ä°ncelik\r\n"
                        + "â¢ 1.7Kg AÄÄ±rlÄ±k");
                System.out.println("\n-------------------------------------------------------------------------------");
            }
        }
    }

    public String getMonsterSeriAd() {
        return monsterSeriAd;
    }

    public void setMonsterSeriAd(String monsterSeriAd) {
        this.monsterSeriAd = monsterSeriAd;
    }

    public float getMonsterFiyat() {
        return monsterFiyat;
    }

    public void setMonsterFiyat(float monsterFiyat) {
        this.monsterFiyat = monsterFiyat;
    }

    public String getMonsterBilgisayarAd() {
        return monsterBilgisayarAd;
    }

    public void setMonsterBilgisayarAd(String monsterBilgisayarAd) {
        this.monsterBilgisayarAd = monsterBilgisayarAd;
    }

}