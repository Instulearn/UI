Feature: Anasayfa Kurs Görüntüleme ve Yönlendirme Fonksiyonları
  @us006
  Scenario: TC_006.1 Featured Courses bölümünde kurslar görüntülenebilmeli ve tıklanınca yönlendirmeli
    Given Kullanıcı anasayfaya gider
    Then Featured Courses başlığı görünür olmalı
    And Öne çıkan kurs linki görünür ve tıklanabilir olmalı
    @us006
  Scenario: TC_006.2 Newest Courses bölümünde kart detayları ve yönlendirme kontrolü
    Then Newest Courses başlığı görünür olmalı
    And Yeni kurs kartında fiyat, saat, tarih ve eğitmen bilgileri görünür olmalı
    And Kurs kartına tıklanınca kurs detay sayfasına yönlendirilmelidir
    And Newest Courses alanındaki View All butonu görünür ve aktif olmalı
    And Go to card ikonları görünür ve tıklanabilir olmalı
    @US006
    Scenario:  TC_006.3 Latest Bundles bölümünde kart detayları ve yönlendirme kontrolü
    Then Latest bundles başlığı görünür olmalı
    And İlk bundle kartında fiyat, saat, tarih ve eğitmen bilgileri görünür olmalı
    And İlk bundle kartı tıklanabilir olmalı
    And Latest Bundles alanındaki View All butonu görünür ve aktif olmalı
    And Go to card ikonları görünür ve tıklanabilir olmalı
   @006
  Scenario: TC_006.4Upcoming Courses bölümünde kart detayları ve yönlendirme kontrolü
    Then Upcoming Courses başlığı görünür olmalı
    And İlk upcoming course kartında fiyat, saat, tarih ve eğitmen bilgileri görünür olmalı
    And İlk upcoming course kartı tıklanabilir olmalı
    And Upcoming Courses alanındaki View All butonu görünür ve aktif olmalı
    And Go to card ikonları görünür ve tıklanabilir olmalı
