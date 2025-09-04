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

🔹 Çıktı (Output)

Ali Tas araci kullaniyor
Veli Tas araci kullaniyor
----------- Proxy kulanimindan sonra -----------
Ali Tas araci kullaniyor
Bu kisi araba kullanamaz

Bu örnekte Proxy Design Pattern, erişim kontrolü amacıyla kullanılmıştır.
