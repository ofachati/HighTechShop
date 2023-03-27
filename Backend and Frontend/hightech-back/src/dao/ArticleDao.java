package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Article;

public enum ArticleDao {
    instance;

    private Map<Integer, Article> contentProvider = new HashMap<>();
    
    private ArticleDao() {


    	// 1. Create a MacBook Pro article
        Article MacBookPro = new Article(1, "MacBook Pro", "A high-performance laptop computer from Apple", "Apple", 1500.0 , "PC Portable", "https://support.apple.com/library/APPLE/APPLECARE_ALLGEOS/SP858/mbp16-gray_2x.png");
        contentProvider.put(MacBookPro.getId(), MacBookPro);
        
        // 2. Create a HP Envy article
        Article HPEnvy = new Article(2, "HP Envy", "A high-performance laptop computer from HP", "HP", 1300.0 , "PC Portable", "https://ssl-product-images.www8-hp.com/digmedialib/prodimg/lowres/c08253991.png");
        contentProvider.put(HPEnvy.getId(), HPEnvy);
        
        // 3. Create a Lenovo ThinkPad article
        Article LenovoThinkPad = new Article(3, "Lenovo ThinkPad", "A reliable laptop computer from Lenovo", "Lenovo", 1000.0, "PC Portable", "https://upload.wikimedia.org/wikipedia/commons/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png");
        contentProvider.put(LenovoThinkPad.getId(), LenovoThinkPad);
        
        // 4. Create a Dell XPS article
        Article DellXPS = new Article(4, "Dell XPS", "A high-end laptop computer from Dell", "Dell", 1700.0 , "PC Portable", "https://cdn.shopify.com/s/files/1/0562/7858/1313/products/laptop-xps-9520-t-black-gallery-4_2048x2048.png?v=1651161724");
        contentProvider.put(DellXPS.getId(), DellXPS);
        
        // 5. Create a Razer Blade article
        Article RazerBlade = new Article(5, "Razer Blade", "A high-performance gaming laptop from Razer", "Razer", 2000.0, "PC Portable", "https://c0.lestechnophiles.com/images.frandroid.com/wp-content/uploads/2022/01/razer-blade-14-2022-frandroid-2022-768x768.png?webp=1&resize=580,580&key=fcdf06a2");
        contentProvider.put(RazerBlade.getId(), RazerBlade);
        
        // 6. Create an ASUS ROG article
        Article ASUSROG = new Article(6, "ASUS ROG", "A high-performance gaming laptop from ASUS", "ASUS", 1700.0 , "PC Portable", "https://c0.lestechnophiles.com/images.frandroid.com/wp-content/uploads/2021/07/asus-rog-zephyrus-m16-frandroid-2021-768x768.png?webp=1&resize=580,580&key=42aca818");
        contentProvider.put(ASUSROG.getId(), ASUSROG);
        
        // 7. Create a Microsoft Surface article
        Article MicrosoftSurface = new Article(7, "Microsoft Surface", "A 2-in-1 laptop computer from Microsoft", "Microsoft", 1200.0 , "PC Portable", "https://ssl-product-images.www8-hp.com/digmedialib/prodimg/lowres/c08253991.png");
        contentProvider.put(MicrosoftSurface.getId(), MicrosoftSurface);
        
        // 8. Create an Acer Swift article
        Article AcerSwift = new Article(8, "Acer Swift", "A lightweight laptop computer from Acer", "Acer", 700.0 , "PC Portable", "https://c0.lestechnophiles.com/images.frandroid.com/wp-content/uploads/2020/04/acer-swift-3-2020-frandroid-2020-768x768.png?webp=1&resize=580,580&key=a0acc1bf");
        contentProvider.put(AcerSwift.getId(), AcerSwift);
        
        // 9. Create a MSI GS65 article
        Article MSIGS65 = new Article(9, "MSI GS65", "A high-performance gaming laptop from MSI", "MSI", 1600.0 , "PC Portable", "https://asset.msi.com/resize/image/global/product/product_2_20181206103734_5c088b6e76cc4.png62405b38c58fe0f07fcef2367d8a9ba1/1024.png");
        contentProvider.put(MSIGS65.getId(), MSIGS65);
        
        // 10. Create a LG Gram article
        Article LGGram = new Article(10, "LG Gram", "A lightweight laptop computer from LG", "LG", 800.0 , "PC Portable", "https://c0.lestechnophiles.com/images.frandroid.com/wp-content/uploads/2022/07/lg-gram-17-2022-frandroid-2022-768x768.png?webp=1&key=568e6a8a");
        contentProvider.put(LGGram.getId(), LGGram);

        // 11. Create a Dell Optiplex article
        Article DellOptiplex = new Article(11, "Dell Optiplex", "A reliable desktop computer from Dell", "Dell", 800.0 , "PC de Bureau", "https://i.dell.com/is/image/DellContent/content/dam/ss2/products/desktops-and-all-in-ones/optiplex/3000-tsff/media-gallery/optiplex-3000sff-gallery-4.psd?fmt=png-alpha&pscan=auto&scl=1&hei=402&wid=402&qlt=100,1&resMode=sharp2&size=402,402&chrss=full");
        contentProvider.put(DellOptiplex.getId(), DellOptiplex);
        
        // 12. Create a HP Elite article
        Article HPElite = new Article(12, "HP Elite", "A high-performance desktop computer from HP", "HP", 900.0 , "PC de Bureau", "https://ssl-product-images.www8-hp.com/digmedialib/prodimg/lowres/c06906716.png");
        contentProvider.put(HPElite.getId(), HPElite);
        
        // 13. Create a Lenovo ThinkCentre article
        Article LenovoThinkCentre = new Article(13, "Lenovo ThinkCentre", "A reliable desktop computer from Lenovo", "Lenovo", 700.0 , "PC de Bureau", "https://www.lenovo.com/medias/lenovo-thinkcentre-m710-sff-hero.png?context=bWFzdGVyfGltYWdlc3w3ODAxNXxpbWFnZS9wbmd8aW1hZ2VzL2g1Mi9oNzEvOTQwNTg5MTY0MTM3NC5wbmd8MGZjOWNhMGM1ODc2ZWJmODBkNzE0NWNlOGEwNDliZTc1ZTE2OGM2ZTEyMWJhMGQ1YjkyNmE0NjVmNzIxMjViOQ");
        contentProvider.put(LenovoThinkCentre.getId(), LenovoThinkCentre);
        
        // 14. Create an Acer Aspire article
        Article AcerAspire = new Article(14, "Acer Aspire", "A budget-friendly desktop computer from Acer", "Acer", 500.0 , "PC de Bureau", "https://static-ecpa.acer.com/media/catalog/product/cache/ab3054ca0c987098b5bb23b2f6bbf813/d/l/dl.bh7aa.002_dl.bh7aa.002.png");
        contentProvider.put(AcerAspire.getId(), AcerAspire);
        
        // 15. Create a Gateway Desktop article
        Article GatewayDesktop = new Article(15, "Gateway Desktop", "A budget-friendly desktop computer from Gateway", "Gateway", 450.0 , "PC de Bureau", "https://www.gatewayusa.com/images/products/GWAP42424/product-top-background-img.png");
        contentProvider.put(GatewayDesktop.getId(), GatewayDesktop);
        
        // 16. Create an ASUS Desktop article
        Article ASUSDesktop = new Article(16, "ASUS Desktop", "A high-performance desktop computer from ASUS", "ASUS", 1000.0 , "PC de Bureau", "https://www.asus.com/media/global/gallery/j815kgvf1fnacyjk_setting_xxx_0_90_end_2000.png");
        contentProvider.put(ASUSDesktop.getId(), ASUSDesktop);
        
        // 17. Create a Microsoft Surface Studio article
        Article SurfaceStudio = new Article(17, "Microsoft Surface Studio", "A high-end desktop computer from Microsoft", "Microsoft", 3000.0 , "PC de Bureau", "https://img-prod-cms-rt-microsoft-com.akamaized.net/cms/api/am/imageFileData/RE50yvl?ver=ced0");
        contentProvider.put(SurfaceStudio.getId(), SurfaceStudio);
        
        // 18. Create a DELL Inspiron article
        Article DELLInspiron = new Article(18, "DELL Inspiron", "A budget-friendly desktop computer from DELL", "DELL", 500.0 , "PC de Bureau", "https://i.dell.com/sites/csimages/App-Merchandizing_Images/all/prod-1910-desktop-aio-24-5410-keyboard-mouse-5221w-800x550-v1.png");
        contentProvider.put(DELLInspiron.getId(), DELLInspiron);
        
      	// 19. Create an HP Prodesk article
        Article HPProdesk = new Article(19, "HP Prodesk", "A business-class desktop computer from HP", "HP", 800.0 , "PC de Bureau", "https://ssl-product-images.www8-hp.com/digmedialib/prodimg/lowres/c06924407.png");
        contentProvider.put(HPProdesk.getId(), HPProdesk);
        
        // 20. Create a Lenovo IdeaCentre article
        Article LenovoIdeaCentre = new Article(20, "Lenovo IdeaCentre", "A budget-friendly desktop computer from Lenovo", "Lenovo", 600.0 , "PC de Bureau", "https://www.lenovo.com/medias/desktop-ideacentre-300serires-3-amd-hero.png?context=bWFzdGVyfHJvb3R8NzExNjZ8aW1hZ2UvcG5nfGhjZS9oYTkvMTA4Mjc3NTg1MzQ2ODYucG5nfGUxYmNmNDNhMzg3OTk1NjM3MTc5M2ZlODBjYjFiMjA5MWE2ODg2MDZiNGU4OTJiMThjZGYxYTliMDMzZjY5NWE");
        contentProvider.put(LenovoIdeaCentre.getId(), LenovoIdeaCentre);

        // 21. Create a Logitech Keyboard article
        Article LogitechKeyboard = new Article(21, "Logitech Keyboard", "A high-quality computer keyboard from Logitech", "Logitech", 50.0 , "Accessoires ordinateurs", "https://resource.logitech.com/content/dam/gaming/en/products/pro-x-keyboard/pro-x-keyboard-gallery-1.png");
        contentProvider.put(LogitechKeyboard.getId(), LogitechKeyboard);
        
        // 22. Create a Razer Mouse article
        Article RazerMouse = new Article(22, "Razer Mouse", "A high-performance computer mouse from Razer", "Razer", 80.0 , "Accessoires ordinateurs", "https://assets2.razerzone.com/images/pnx.assets/e429c76f51b34a0ce9c368be025e58b8/razer-naga-left-handed-edition-500x500.png");
        contentProvider.put(RazerMouse.getId(), RazerMouse);
        
        // 23. Create a Corsair Headset article
        Article CorsairHeadset = new Article(23, "Corsair Headset", "A high-quality gaming headset from Corsair", "Corsair", 100.0 , "Accessoires ordinateurs", "https://www.corsair.com/medias/sys_master/images/images/h41/he4/9111727144990/-CA-9011152-EU-Gallery-Void-Pro-Wireless-Carbon-01.png");
        contentProvider.put(CorsairHeadset.getId(), CorsairHeadset);
        
        // 24. Create a Logitech Webcam article
        Article LogitechWebcam = new Article(24, "Logitech Webcam", "A high-quality computer webcam from Logitech", "Logitech", 70.0 , "Accessoires ordinateurs", "https://resource.logitech.com/w_800,c_lpad,ar_4:3,q_auto,f_auto,dpr_1.0/d_transparent.gif/content/dam/logitech/en/products/video-conferencing/c505/gallery/c505-gallery-1.png?v=1");
        contentProvider.put(LogitechWebcam.getId(), LogitechWebcam);
        
        // 25. Create a SteelSeries Mousepad article
        Article SteelSeriesMousepad = new Article(25, "SteelSeries Mousepad", "A high-performance mousepad from SteelSeries", "SteelSeries", 20.0 , "Accessoires ordinateurs", "https://media.steelseriescdn.com/thumbs/filer_public/98/f4/98f4f01a-6da3-45cf-a1ff-cdc8e553fa75/1200x_buy_qck-heavy_l_03.png__1920x1080_crop-fit_optimize_subsampling-2.png");
        contentProvider.put(SteelSeriesMousepad.getId(), SteelSeriesMousepad);
        
        // 26. Create a HyperX RAM article
        Article HyperXRAM = new Article(26, "HyperX RAM", "High-performance RAM from HyperX", "HyperX", 200.0 , "Accessoires ordinateurs", "https://ae01.alicdn.com/kf/Sebb75737e85a41ebabba59cc18816c66S/Kingston-m-moire-de-serveur-d-ordinateur-de-bureau-HyperX-FURY-RGB-mod-le-DDR4-capacit.jpg_.webp");
        contentProvider.put(HyperXRAM.getId(), HyperXRAM);
        
        // 27. Create a ASUS Graphics Card article
        Article ASUSGraphicsCard = new Article(27, "ASUS Graphics Card", "A high-performance graphics card from ASUS", "ASUS", 400.0 , "Accessoires ordinateurs", "https://dlcdnwebimgs.asus.com/gain/a391e6f3-74d9-46d8-bccf-24f0e6713232/w800");
        contentProvider.put(ASUSGraphicsCard.getId(), ASUSGraphicsCard);
        
         // 28. Create a Corsair Power Supply article
        Article CorsairPowerSupply = new Article(28, "Corsair Power Supply", "A high-quality power supply from Corsair", "Corsair", 100.0 , "Accessoires ordinateurs", "https://www.corsair.com/medias/sys_master/images/images/h77/he5/9463825465374/-CP-9020210-EU-Gallery-CV550-PSU-01.png");
        contentProvider.put(CorsairPowerSupply.getId(), CorsairPowerSupply);
        
        // 29. Create a Western Digital Hard Drive article
        Article WesternDigitalHardDrive = new Article(29, "Western Digital Hard Drive", "A high-capacity hard drive from Western Digital", "Western Digital", 100.0 , "Accessoires ordinateurs", "https://www.domotec-services.com/website/image/product.product/1954/image");
        contentProvider.put(WesternDigitalHardDrive.getId(), WesternDigitalHardDrive);
        
        // 30. Create a Cooler Master CPU Cooler article
        Article CoolerMasterCPUCooler = new Article(30, "Cooler Master CPU Cooler", "A high-performance CPU cooler from Cooler Master", "Cooler Master", 50.0 , "Accessoires ordinateurs", "https://cdn.coolermaster.com/media/assets/1020/ma620m-380x380-1-hover.png");
        contentProvider.put(CoolerMasterCPUCooler.getId(), CoolerMasterCPUCooler);

	 // 31. Create an iPhone article
  Article iPhone = new Article(31, "iPhone XS", "A high-end Smart phone from Apple", "Apple", 1000.0 , "Smart phone", "https://images.frandroid.com/wp-content/uploads/2021/09/apple-iphone-13-pro-frandroid-2021.png");
  contentProvider.put(iPhone.getId(), iPhone);
  
  // 32. Create a Samsung Galaxy article
  Article SamsungGalaxy = new Article(32, "Samsung Galaxy S21", "A high-end Smart phone from Samsung", "Samsung", 800.0 , "Smart phone", "https://images.frandroid.com/wp-content/uploads/2020/12/samsung-galaxy-s21-frandroid-2021-leak.png");
  contentProvider.put(SamsungGalaxy.getId(), SamsungGalaxy);
  
  // 33. Create a Google Pixel article
  Article GooglePixel = new Article(33, "Google Pixel 6", "A high-end Smart phone from Google", "Google", 700.0 , "Smart phone", "https://lh3.googleusercontent.com/rOk899xWpz7gucQADZrVmGeziszDavjTPzTPb87V1fjYT-xstKc9P-gUs1FEd7tvmYrSE4rtyq8LEavAElBCHSMhW8h5Teldv6Wg=rw-e365-w1182");
  contentProvider.put(GooglePixel.getId(), GooglePixel);
  
  // 34. Create a Xiaomi Mi article
  Article XiaomiMi = new Article(34, "Xiaomi Mi 11", "A high-end Smart phone from Xiaomi", "Xiaomi", 600.0 , "Smart phone", "http://i01.appmifile.com/webfile/globalimg/wangjy/J1J2/J1-B-800!800x800!85.png");
  contentProvider.put(XiaomiMi.getId(), XiaomiMi);
  
  // 35. Create a Huawei P40 article
  Article HuaweiP40 = new Article(35, "Huawei P40", "A high-end Smart phone from Huawei", "Huawei", 500.0 , "Smart phone", "https://images.frandroid.com/wp-content/uploads/2020/03/huawei-p40-frandroid-2020.png");
  contentProvider.put(HuaweiP40.getId(), HuaweiP40);
  
  // 36. Create a Oneplus 9 Pro article
  Article Oneplus9Pro = new Article(36, "Oneplus 9 Pro", "A high-end Smart phone from Oneplus", "Oneplus", 800.0 , "Smart phone", "https://oasis.opstatics.com/content/dam/oasis/page/2021/9-series/spec-image/9-pro/Morning%20mist-gallery.png");
  contentProvider.put(Oneplus9Pro.getId(), Oneplus9Pro);
  
  // 37. Create a Oppo Find X3 article
  Article OppoFindX3 = new Article(37, "Oppo Find X3", "A high-end Smart phone from Oppo", "Oppo", 700.0 , "Smart phone", "https://images.frandroid.com/wp-content/uploads/2021/03/oppo-find-x3-pro.png");
  contentProvider.put(OppoFindX3.getId(), OppoFindX3);
  
  // 38. Create a Vivo X60 Pro article
  Article VivoX60Pro = new Article(38, "Vivo X60 Pro", "A high-end Smart phone from Vivo", "Vivo", 600.0 , "Smart phone", "https://images.frandroid.com/wp-content/uploads/2021/03/vivo-x60-pro-frandroid-2021.png");
  contentProvider.put(VivoX60Pro.getId(), VivoX60Pro);
  
    // 39. Create a Realme X50 Pro article
  Article RealmeX50Pro = new Article(39, "Realme X50 Pro", "A high-end Smart phone from Realme", "Realme", 500.0 , "Smart phone", "https://images.frandroid.com/wp-content/uploads/2020/02/realme-x50-pro-5g-frandroid-2020-1.png");
  contentProvider.put(RealmeX50Pro.getId(), RealmeX50Pro);
  
  // 40. Create a Nokia 9 PureView article
  Article Nokia9PureView = new Article(40, "Nokia 9 PureView", "A high-end Smart phone from Nokia", "Nokia", 600.0 , "Smart phone", "https://images.frandroid.com/wp-content/uploads/2019/04/nokia-9-pureview-2019-frandroid.png");
  contentProvider.put(Nokia9PureView.getId(), Nokia9PureView);
  
  // 41. Create a Panasonic Cordless Phone article
  Article PanasonicPhone1 = new Article(41, "Panasonic Cordless Phone", "A cordless landline phone from Panasonic", "Panasonic", 50.0 , "Tel Fixe", "https://www.panasonic.com/content/dam/pim/mi/en/KX/KX-TGC/KX-TGC213UE/KX-TGC213UE-Product_ImageGlobal-1_mi_en.png");
  contentProvider.put(PanasonicPhone1.getId(), PanasonicPhone1);
  
  // 42. Create a GE Cordless Phone article
  Article GEPHone2 = new Article(42, "GE Cordless Phone", "A cordless landline phone from GE", "GE", 40.0 , "Tel Fixe", "https://starface.com/app/uploads/2021/07/STARFACE_Yealink_Telefone.png");
  contentProvider.put(GEPHone2.getId(), GEPHone2);
  
  // 43. Create a VTech Cordless Phone article
  Article VTechPhone3 = new Article(43, "VTech Cordless Phone", "A cordless landline phone from VTech", "VTech", 35.0 , "Tel Fixe", "https://cdn-web.vtp-media.com/products/DS/DS6421-X/RGHT_6421-3_LG-min.png");
  contentProvider.put(VTechPhone3.getId(), VTechPhone3);
  
  // 44. Create a AT&T Cordless Phone article
  Article ATTCordlessPhone4 = new Article(44, "AT&T Cordless Phone", "A cordless landline phone from AT&T", "AT&T", 45.0 , "Tel Fixe", "https://cdn-media-att.vtp-media.com/products/CRL/CRL32XX2/st_32102_bl_hd-min.png");
  contentProvider.put(ATTCordlessPhone4.getId(), ATTCordlessPhone4);
  
  // 45. Create a Motorola Cordless Phone article
  Article MotorolaPhone5 = new Article(45, "Motorola Cordless Phone", "A cordless landline phone from Motorola", "Motorola", 55.0 , "Tel Fixe", "https://www.onedirect.fr/media/wysiwyg/images/motorola/Wireless/Motorola-O201/motorola_o201_color_naranja_2.png");
  contentProvider.put(MotorolaPhone5.getId(), MotorolaPhone5);
  
  // 46. Create a Uniden Cordless Phone article
  Article UnidenPhone6 = new Article(46, "Uniden Cordless Phone", "A cordless landline phone from Uniden", "Uniden", 60.0 , "Tel Fixe", "https://uniden.com.au/wp-content/uploads/img_dect1735-angled_2000x2000.png");
  contentProvider.put(UnidenPhone6.getId(), UnidenPhone6);
  
  // 47. Create a JBL Cordless Phone article
  Article JBLPhone7 = new Article(47, "JBL Cordless Phone", "A cordless landline phone from JBL", "JBL", 75.0 , "Tel Fixe", "https://motorolafr.vtexassets.com/arquivos/ids/158362-800-auto?width=800&height=auto&aspect=true");
  contentProvider.put(JBLPhone7.getId(), JBLPhone7);
  
  // 48. Create a Nokia Cordless Phone article
  Article NokiaPhone11 = new Article(48, "Nokia Cordless Phone", "A cordless landline phone from Nokia", "Nokia", 70.0 , "Tel Fixe", "https://images.ctfassets.net/wcfotm6rrl7u/157PwKtfB7G1bcJwUbhDcs/784eb93b27a6cadac05e99613aea8304/Android11-DTC-Voice_control-desktop.png");
  contentProvider.put(NokiaPhone11.getId(), NokiaPhone11);

  // 49. Create a LG Cordless Phone article
  Article LGPhone9 = new Article(49, "LG Cordless Phone", "A cordless landline phone from LG", "LG", 80.0 , "Tel Fixe", "https://www.echosdunet.net/sites/echosdunet.net/files/images-v1/bibliotheque/LG/2012/LG-L9.png");
  contentProvider.put(LGPhone9.getId(), LGPhone9);
  
  // 50. Create a Philips Cordless Phone article
  Article PhilipsPhone10 = new Article(50, "Philips Cordless Phone", "A cordless landline phone from Philips", "Philips", 90.0 , "Tel Fixe", "http://cdn.shopify.com/s/files/1/0523/8272/8387/products/telephone-sans-fil-pdx-1100-noir-mono_08b10b1b-39b0-4c4a-aaa8-47ca67389704.png?v=1643551579");
  contentProvider.put(PhilipsPhone10.getId(), PhilipsPhone10);
  
  // 51. Create a Phone Case article
  Article PhoneCase1 = new Article(51, "Leather Phone Case", "A leather protective case for Smart phones", "Unknown", 15.0, "Accessoires téléphone", "http://cdn.shopify.com/s/files/1/0585/5258/2321/products/clearcase1600x2160clear_a.png?v=1658476541");
  contentProvider.put(PhoneCase1.getId(), PhoneCase1);
  
  // 52. Create a Phone Screen Protector article
  Article PhoneScreenProtector = new Article(52, "Phone Screen Protector", "A screen protector for Smart phones", "Unknown", 5.0, "Accessoires téléphone", "https://images.dailyobjects.com/marche/product-images/1803/samsung-galaxy-s22-9d-tempered-glass-screen-protector-images/Samsung-Galaxy-S22-9D-Tempered-Glass-Screen-Protector.png?tr=cm-pad_resize,v-2,w-656,h-639,dpr-2,q-60");
  contentProvider.put(PhoneScreenProtector.getId(), PhoneScreenProtector);
  
  // 53. Create a Phone Stand article
  Article PhoneStand = new Article(53, "Phone Stand", "A stand for holding a Smart phone", "Unknown", 8.0, "Accessoires téléphone", "https://cdn.shopify.com/s/files/1/0257/5246/9566/products/60324-474370.png?v=1658322965&width=600");
  contentProvider.put(PhoneStand.getId(), PhoneStand);
  
  // 54. Create a Phone Car Charger article
  Article PhoneCarCharger = new Article(54, "Phone Car Charger", "A car charger for Smart phones", "Unknown", 10.0, "Accessoires téléphone", "https://cdn.shopify.com/s/files/1/0108/1062/products/12V-USB-Car-Adaptor_600x600_1810-138.png?v=1539318670");
  contentProvider.put(PhoneCarCharger.getId(), PhoneCarCharger);
  
  // 55. Create a Phone Wireless Charger article
  Article PhoneWirelessCharger = new Article(55, "Phone Wireless Charger", "A wireless charger for Smart phones", "Unknown", 20.0, "Accessoires téléphone", "https://cdn.shopify.com/s/files/1/1719/3949/products/0002_DOCK-WIRELESS_SLATE_Hero_800x_f227a204-0f51-46d9-9110-98b4b7d2907d_2048x2048.png?v=1602664844");
  contentProvider.put(PhoneWirelessCharger.getId(), PhoneWirelessCharger);
  
  // 56. Create a Phone Battery Pack article
  Article PhoneBatteryPack = new Article(56, "Phone Battery Pack", "A portable battery pack for Smart phones", "Unknown", 30.0, "Accessoires téléphone", "https://motorolaus.vtexassets.com/arquivos/ids/157230/new-powerbank-10w-tp10k-hero.png?v=637081133082430000");
  contentProvider.put(PhoneBatteryPack.getId(), PhoneBatteryPack);
  
  // 57. Create a Phone Headphones article
  Article PhoneHeadphones = new Article(57, "Phone Headphones", "Headphones for use with a Smart phone", "Unknown", 50.0, "Accessoires téléphone", "https://cdn.tmobile.com/content/dam/t-mobile/en-p/accessories/190198001696/190198001696-frontimage.png");
  contentProvider.put(PhoneHeadphones.getId(), PhoneHeadphones);
  
  // 58. Create a Phone Bluetooth Speaker article
  Article PhoneBluetoothSpeaker = new Article(58, "Phone Bluetooth Speaker", "A Bluetooth speaker for use with a Smart phone", "Unknown", 60.0, "Accessoires téléphone", "https://fr.jbl.com/dw/image/v2/BFND_PRD/on/demandware.static/-/Sites-masterCatalog_Harman/default/dwd86747b5/JBL_FLIP4_PHONE_BLUE_6920_FS_x2-1605x1605px.png?sw=680&sh=680");
  contentProvider.put(PhoneBluetoothSpeaker.getId(), PhoneBluetoothSpeaker);
  
  // 59. Create a Phone Car Mount article
  Article PhoneCarMount = new Article(59, "Phone Car Mount", "A car mount for holding a Smart phone", "Unknown", 15.0, "Accessoires téléphone", "https://www.hellottec.com/wp-content/uploads/2TT08-1.png");
  contentProvider.put(PhoneCarMount.getId(), PhoneCarMount);
  
  // 60. Create a Phone Stylus article
  Article PhoneStylus = new Article(60, "Phone Stylus", "A stylus for use with a Smart phone", "Unknown", 10.0,  "Accessoires téléphone", "https://cdn.shopify.com/s/files/1/0121/0014/1114/products/AMM01TBUS_MAIN2_707c4a2a-06ef-4014-87e1-489b9df614ae-647098_1024x1024.png?v=1625678719");
  contentProvider.put(PhoneStylus.getId(), PhoneStylus);


  // 61. Create a Seagate 1TB Hard Drive article
  Article Seagate1TB = new Article(61, "Seagate 1TB Hard Drive", "A 1TB hard drive from Seagate", "Seagate", 50.0 , "Disque dur", "https://www.media-rdc.com/medias/7bead61b67d83758b4df4336d74eb930/ironwolf-g1d-1tb-hero-left-lo-res.png?cimgnr=DlwoM");
  contentProvider.put(Seagate1TB.getId(), Seagate1TB);
  
  // 62. Create a Western Digital 2TB Hard Drive article
  Article WesternDigital2TB = new Article(62, "Western Digital 2TB Hard Drive", "A 2TB hard drive from Western Digital", "Western Digital", 70.0 , "Disque dur", "https://www.westerndigital.com/content/dam/store/en-us/assets/products/internal-storage/wd-red-plus-sata-3-5-hdd/gallery/wd-red-plus-sata-3-5-hdd-1tb.png.wdthumb.1280.1280.webp");
  contentProvider.put(WesternDigital2TB.getId(), WesternDigital2TB);
  
  // 63. Create a Toshiba 500GB Hard Drive article
  Article Toshiba500GB = new Article(63, "Toshiba 500GB Hard Drive", "A 500GB hard drive from Toshiba", "Toshiba", 30.0 , "Disque dur", "https://stech.com.bd/wp-content/uploads/2021/07/1612194379_6b101d99ef924ad2cfc5107d8edd9908-removebg-preview.png");
  contentProvider.put(Toshiba500GB.getId(), Toshiba500GB);
  
  // 64. Create a Hitachi 1.5TB Hard Drive article
  Article Hitachi1_5TB = new Article(64, "Hitachi 1.5TB Hard Drive", "A 1.5TB hard drive from Hitachi", "Hitachi", 60.0 , "Disque dur", "https://www.portables4gamers.com/wp-content/uploads/2010/10/disque-dur-hitachi.png");
  contentProvider.put(Hitachi1_5TB.getId(), Hitachi1_5TB);
  
  // 65. Create a Kingston 120GB Hard Drive article
  Article Kingston120GB = new Article(65, "Kingston 120GB Hard Drive", "A 120GB hard drive from Kingston", "Kingston", 20.0 , "Disque dur", "https://cdn.shopify.com/s/files/1/0307/0128/9603/products/DDK-SA400S37-240G_600x.png?v=1665573690");
  contentProvider.put(Kingston120GB.getId(), Kingston120GB);
  
  // 66. Create a Sandisk 250GB Hard Drive article
  Article Sandisk250GB = new Article(66, "Sandisk 250GB Hard Drive", "A 250GB hard drive from Sandisk", "Sandisk", 40.0 , "Disque dur", "https://www.lacameraembarquee.fr/50763-large_default/disque-ssd-extreme-v2-sandisk.jpg");
  contentProvider.put(Sandisk250GB.getId(), Sandisk250GB);
  
  // 67. Create a Corsair 500GB Hard Drive article
  Article Corsair500GB = new Article(67, "Corsair 500GB Hard Drive", "A 500GB hard drive from Corsair", "Corsair", 35.0 , "Disque dur", "https://www.corsair.com/medias/sys_master/images/images/hde/h8e/9287793967134/-CSSD-F500GBMP600-Gallery-MP600-01.png");
  contentProvider.put(Corsair500GB.getId(), Corsair500GB);
  
  // 68. Create a Adata 1TB Hard Drive article
  Article Adata1TB = new Article(68, "Adata 1TB Hard Drive", "A 1TB hard drive from Adata", "Adata", 45.0 , "Disque dur", "https://webapi3.adata.com/storage/product/hd330_f.png");
  contentProvider.put(Adata1TB.getId(), Adata1TB);
  
  // 69. Create a Seagate 2TB Hard Drive article
  Article Seagate2TB = new Article(69, "Seagate 2TB Hard Drive", "A 2TB hard drive from Seagate", "Seagate", 75.0 , "Disque dur", "https://www.sevecu.fr/images/stories/virtuemart/product/hd2tb-s.png");
  contentProvider.put(Seagate2TB.getId(), Seagate2TB);
  
  // 70. Create a Western Digital 500GB Hard Drive article
  Article WesternDigital500GB = new Article(70, "Western Digital 500GB Hard Drive", "A 500GB hard drive from Western Digital", "Western Digital", 40.0 , "Disque dur", "https://www.westerndigital.com/content/dam/store/en-us/assets/products/internal-storage/wd-blue-desktop-sata-hdd/gallery/wd-blue-pc-desktop-hard-drive-500gb.png");
  contentProvider.put(WesternDigital500GB.getId(), WesternDigital500GB);

  // 71. Create a Kingston USB drive
  Article KingstonUSB = new Article(71, "Kingston USB Drive", "A high-capacity USB drive from Kingston", "Kingston", 20.0 , "Clé USB", "https://cdn-reichelt.de/bilder/web/xxl_ws/E910/KINGSTON_DTKN_64GB_01.png");
  contentProvider.put(KingstonUSB.getId(), KingstonUSB);
  
  // 72. Create a Sandisk USB drive
  Article SandiskUSB = new Article(72, "Sandisk USB Drive", "A high-speed USB drive from Sandisk", "Sandisk", 25.0 , "Clé USB", "https://www.westerndigital.com/content/dam/store/en-us/assets/products/usb-flash-drives/ultra-luxe-usb-3-1/gallery/ultra-luxe-usb-3-1-angle-down-left.png");
  contentProvider.put(SandiskUSB.getId(), SandiskUSB);
  
  // 73. Create a Toshiba USB drive
  Article ToshibaUSB = new Article(73, "Toshiba USB Drive", "A reliable USB drive from Toshiba", "Toshiba", 15.0 , "Clé USB", "https://europe.kioxia.com/content/dam/kioxia/en-europe/personal/news/2017/img/TOSHIBA_Press_U363_U364_Article_Product_Range.png");
  contentProvider.put(ToshibaUSB.getId(), ToshibaUSB);
  
  // 74. Create a Corsair USB drive
  Article CorsairUSB = new Article(74, "Corsair USB Drive", "A high-performance USB drive from Corsair", "Corsair", 30.0 , "Clé USB", "https://www.corsair.com/corsairmedia/sys_master/productcontent/CMFVY3A-32GB-FV3_001.png");
  contentProvider.put(CorsairUSB.getId(), CorsairUSB);
  
  // 75. Create a PNY USB drive
  Article PNYUSB = new Article(75, "PNY USB Drive", "A reliable USB drive from PNY", "PNY", 20.0 , "Clé USB", "https://www.rueducommerce.fr/media/produits/pny/img//attache-4-pastel-coral-64go-usb-20-attache-4-pastel-coral-64go-usb-20-stick-11466964-29958786_1140x1140.png");
  contentProvider.put(PNYUSB.getId(), PNYUSB);
  
  // 76. Create a Lexar USB drive
  Article LexarUSB = new Article(76, "Lexar USB Drive", "A high-speed USB drive from Lexar", "Lexar", 25.0 , "Clé USB", "https://res.cloudinary.com/rsc/image/upload/bo_1.5px_solid_white,b_auto,c_pad,dpr_2,f_auto,h_399,q_auto,w_710/c_pad,h_399,w_710/Y2030093-01?pgw=1");
  contentProvider.put(LexarUSB.getId(), LexarUSB);
  
  // 77. Create a Verbatim USB drive
  Article VerbatimUSB = new Article(77, "Verbatim USB Drive", "A high-capacity USB drive from Verbatim", "Verbatim", 30.0 , "Clé USB", "https://www.coursesu.com/dw/image/v2/BBQX_PRD/on/demandware.static/-/Sites-digitalu-master-catalog/default/dw458269cc/23942490647_A1N0_6238943_S16.png?sw=388&sh=388&sm=fit");
  contentProvider.put(VerbatimUSB.getId(), VerbatimUSB);
  
  // 78. Create a Adata USB drive
  Article AdataUSB = new Article(78, "Adata USB Drive", "A high-performance USB drive from Adata", "Adata", 25.0 , "Clé USB", "https://webapi3.adata.com/storage/ProductVisual/214.png");
  contentProvider.put(AdataUSB.getId(), AdataUSB);
  
  // 79. Create a SanDisk Ultra USB drive
  Article SanDiskUltraUSB = new Article(79, "SanDisk Ultra USB Drive", "A high-speed and high-capacity USB drive from SanDisk", "SanDisk", 35.0 , "Clé USB", "https://www.westerndigital.com/content/dam/store/en-us/assets/products/usb-flash-drives/ultra-dual-drive-luxe-usb-3-1-type-c/gallery/ultra-dual-drive-luxe-usb-3-1-type-c-1.png");
  contentProvider.put(SanDiskUltraUSB.getId(), SanDiskUltraUSB);
  
  // 80. Create a HP USB drive
  Article HPUSB = new Article(80, "HP USB Drive", "A reliable USB drive from HP", "HP", 20.0 , "Clé USB", "https://media.bechtle.com/is/180712/1c4b3d4ee288fc9434f5175bf56070570/c3/gallery/839f3beeb7314e9497b8d00641067c14?version=0");
  contentProvider.put(HPUSB.getId(), HPUSB);
  
  // 81. Create a Samsung SSD article
  Article SamsungSSD = new Article(81, "Samsung SSD 860 EVO", "A high-performance solid-state drive from Samsung", "Samsung", 100.0 , "Accessoires stockage", "https://images.samsung.com/is/image/samsung/fr-870-qvo-sata-3-2-5-ssd-mz-77q1t0bw-frontblack-286830046?$730_584_PNG$");
  contentProvider.put(SamsungSSD.getId(), SamsungSSD);
  
  // 82. Create a SanDisk USB article
  Article SanDiskUSB = new Article(82, "SanDisk USB Drive", "A high-capacity flash drive from SanDisk", "SanDisk", 20.0 , "Accessoires stockage", "https://www.westerndigital.com/content/dam/store/en-us/assets/products/usb-flash-drives/cruzer-blade-usb-2-0/gallery/cruzer-blade-usb-2-0-angle.png");
  contentProvider.put(SanDiskUSB.getId(), SanDiskUSB);
  
  // 83. Create a Western Digital HDD article
  Article WesternDigitalHDD = new Article(83, "Western Digital HDD", "A high-capacity hard disk drive from Western Digital", "Western Digital", 70.0 , "Accessoires stockage", "https://www.westerndigital.com/content/dam/store/en-us/assets/products/portable/wd-elements-portable/gallery/1tb/wd-elements-portable-1-2tb-front.png.wdthumb.1280.1280.webp");
  contentProvider.put(WesternDigitalHDD.getId(), WesternDigitalHDD);
  
  // 84. Create a Seagate External HDD article
  Article SeagateExternalHDD = new Article(84, "Seagate External HDD", "A high-capacity external hard disk drive from Seagate", "Seagate", 90.0 , "Accessoires stockage", "https://www.seagate.com/content/dam/seagate/migrated-assets/www-content/products/external-hard-drives/basic-external-hard-drive/_shared/masters/slider-1-basic-external-hard-drive-product-detail.png");
  contentProvider.put(SeagateExternalHDD.getId(), SeagateExternalHDD);
  
  // 85. Create a Kingston USB article
  Article KingstonUSB2 = new Article(85, "Kingston USB Drive", "A high-capacity flash drive from Kingston", "Kingston", 25.0 , "Accessoires stockage", "https://cdn-reichelt.de/bilder/web/xxl_ws/E910/KINGSTON_DT70_32GB_01.png");
  contentProvider.put(KingstonUSB.getId(), KingstonUSB2);
  
  // 86. Create a Corsair SSD article
  Article CorsairSSD = new Article(86, "Corsair SSD MP600", "A high-performance solid-state drive from Corsair", "Corsair", 120.0 , "Accessoires stockage", "https://www.corsair.com/medias/sys_master/images/images/h26/hde/9112810094622/-CSSD-F1920GBMP510-Gallery-MP510-01.png");
  contentProvider.put(CorsairSSD.getId(), CorsairSSD);
  
  // 87. Create a Crucial SSD article
  Article CrucialSSD = new Article(87, "Crucial SSD BX500", "A budget solid-state drive from Crucial", "Crucial", 60.0 , "Accessoires stockage", "https://www.crucial.fr/content/dam/crucial/ssd-products/bx500/images/web/bx500-rc-hero-image.psd.transform/medium-png/img.png");
  contentProvider.put(CrucialSSD.getId(), CrucialSSD);
  
  // 88. Create a Toshiba External HDD article
  Article ToshibaExternalHDD = new Article(88, "Toshiba External HDD", "A high-capacity external hard disk drive from Toshiba", "Toshiba", 80.0 , "Accessoires stockage", "https://www.toshiba-storage.com/wp-content/uploads/2020/08/200829_toshiba_storage_products_canvio_advance_product.png");
  contentProvider.put(ToshibaExternalHDD.getId(), ToshibaExternalHDD);
  
  // 89. Create a Adata SSD article
  Article AdataSSD = new Article(89, "Adata SSD SU630", "A budget solid-state drive from Adata", "Adata", 55.0 , "Accessoires stockage", "https://webapi3.adata.com/storage/product/591.png");
  contentProvider.put(AdataSSD.getId(), AdataSSD);
  
  // 90. Create a HP USB article
  Article HPUSB1 = new Article(90, "HP USB Drive", "A high-capacity flash drive from HP", "HP", 15.0 , "Accessoires stockage", "https://www.microdistri.com/image/cache/catalog/man/HP-USB-Gigabit-1100x1100w.png.webp");
  contentProvider.put(HPUSB.getId(), HPUSB1);


    }

    public Map<Integer, Article> getModel() {
        return contentProvider;
    }
    
    public List<Article> getArticles() {
        return new ArrayList<>(contentProvider.values());
    }

    public Article addArticle(String libelle, String description, String marque, double prix, String categorie, String photo) {
        int maxId = 0;
        for (Article a : contentProvider.values()) {
            if (a.getId() > maxId) {
                maxId = a.getId();
            }
        }
        Article a= new Article(maxId + 1, libelle,  description,  marque,  prix,  categorie,   photo);
        contentProvider.put(maxId + 1,a);
        return a;
    }

    public void updateArticle(Article article) {
        contentProvider.put(article.getId(), article);
    }

    public void deleteArticle(int id) {
        contentProvider.remove(id);
    }
    
    public List<Article> getArticlesByCategory(String category) {
        List<Article> articlesByCategory = new ArrayList<>();
        for (Article article : contentProvider.values()) {
            if (article.getCategorie().equals(category)) {
                articlesByCategory.add(article);
            }
        }
        return articlesByCategory;
    }
    

    
}
