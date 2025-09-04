# Proxy Design Pattern (Java Örneği)

Proxy Design Pattern (Vekil)

Proxy Design Pattern, yapısal tasarım desenlerinden biridir.
Amacı, bir nesneye erişimi kontrol etmek ve bu erişim sırasında ek işlevler katmaktır.
Proxy, orijinal nesne ile istemci arasında bir aracı görevi görür.

🔹 Senaryonun Açıklaması

Bu örnekte:

IVehicle → Arabayı sürme davranışını tanımlayan arayüz.

Vehicle → Arabayı gerçekten süren sınıf.

VehicleProxy → Arabayı sürmek isteyen kişinin ehliyet kontrolünü yapan vekil sınıf.

Person → Arabayı sürmek isteyen kişiyi temsil eder.

Proxy (main) → Uygulamanın başlangıç noktası.

```
🔹 Çıktı (Output)

Ali Tas araci kullaniyor  
Veli Tas araci kullaniyor  
----------- Proxy kulanimindan sonra -----------  
Ali Tas araci kullaniyor  
Bu kisi araba kullanamaz
```
## 🔹 Nasıl Çalışır?

1. `main` içinde önce doğrudan **Vehicle** sınıfı kullanılır.  
   - Ali’nin ehliyeti var → Aracı sürebiliyor.  
   - Veli’nin ehliyeti yok → Ama yine de aracı sürebiliyor (çünkü kontrol yok).  

2. Daha sonra **VehicleProxy** kullanılır.  
   - **Proxy burada devreye girer.**  
   - Kişinin ehliyeti olup olmadığını **VehicleProxy** kontrol eder.  
   - Eğer ehliyeti varsa → Proxy, isteği gerçek sınıf olan **Vehicle**’a yönlendirir.  
   - Eğer ehliyeti yoksa → Proxy isteği engeller ve "Bu kişi araba kullanamaz" çıktısını verir.  

3. Böylece Proxy, gerçek nesneye erişmeden önce **ekstra bir kontrol katmanı** sağlar.  
   - Görevi: **“Gerçek nesneye giden yolu filtrelemek ve gerekirse erişimi engellemek.”**
   - 
Bu örnekte Proxy Design Pattern, erişim kontrolü amacıyla kullanılmıştır.
