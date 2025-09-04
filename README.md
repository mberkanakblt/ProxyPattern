Proxy Design Pattern (Vekil)

Proxy Design Pattern, yapısal tasarım desenlerinden biridir.
Amacı, bir nesneye erişimi kontrol etmek ve bu erişim sırasında ek işlevler katmaktır.
Proxy, orijinal nesne ile istemci arasında bir aracı görevi görür.

📌 Hangi Durumlarda Kullanılır?
1. Ağır Nesnelerin Yönetimi

Büyük boyutlu resimler, videolar, raporlar ya da dosyalar belleğe hemen yüklenmek yerine sadece ihtiyaç duyulduğunda yüklenir.

Örnek: Bir fotoğraf galerisi uygulamasında resimler sadece açıldığında yüklenir.

2. Erişim Kontrolü

Bir nesneye erişmeden önce kullanıcının yetkisi kontrol edilebilir.

Örnek: Banka sisteminde müşteri sadece kendi hesap hareketlerini görebilir; çalışan tüm verileri görebilir.
Proxy, kimin hangi veriye ulaşabileceğini kontrol eder.

3. Loglama ve İzleme

Nesneye erişim öncesi ya da sonrası loglama yapılabilir.

Örnek: Bir uygulamada kullanıcı her dosya açtığında log tutulur. Bu kontrol Proxy üzerinden yapılır.

4. Cache (Önbellekleme)

Aynı isteğin tekrar tekrar gerçek nesneye gitmesini önler, performansı artırır.

5. Uzak Nesnelere Erişim

Farklı bir sunucuda ya da ağda bulunan nesnelere erişirken Proxy kullanılabilir.

6. Güvenlik

Belirli kullanıcıların belirli işlemleri yapmasına izin verir.

Örnek: Dosya sisteminde sadece admin rolündeki kişiler dosya silebilir.

7. Transaction ve AOP Mantığı

Spring Boot’ta @Transactional, aslında Proxy mekanizması ile çalışır.
Metod çağrısı proxy üzerinden geçer:
İşlem başlatılır
Hata olursa rollback yapılır
Başarılı olursa commit edilir
Böylece iş mantığına dokunmadan transaction yönetimi sağlanır.