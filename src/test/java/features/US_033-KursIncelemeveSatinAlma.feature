Feature: [US_012] ınstructorları inceleyip randevu oluşturabilme

  Scenario: TC_33.1 Anasayfada 'Courses' linki görünürlük test
    * Kullanici login sayfasina gider
    * Kullanici "abcd@abcd.com" ve "Abcd.1234" ile login olur
    * Dashboard menu header da Courses basligi goruntulenir ve tiklanir

  Scenario:TC_33.2 Text (Courses) görünürlük testi
    * Kullanici login sayfasina gider
    * Kullanici "abcd@abcd.com" ve "Abcd.1234" ile login olur
    * Dashboard menu header da Courses basligi goruntulenir ve tiklanir
    * courses sayfasına gidip text (Courses) görüntülenir


  Scenario:TC_33.3 Courses sayfasında search textBox ve search buton görünürlük testi
    * Kullanici login sayfasina gider
    * Kullanici "abcd@abcd.com" ve "Abcd.1234" ile login olur
    * Dashboard menu header da Courses basligi goruntulenir ve tiklanir
    * courses sayfasına gidip text (Courses) görüntülenir
    * Courses sayfasında search textBox ve search buton görüntülenir

  Scenario:TC_33.4 Kurs secmeden önce filtreleme işlemleri testi
    * Kullanici login sayfasina gider
    * Kullanici "abcd@abcd.com" ve "Abcd.1234" ile login olur
    * Dashboard menu header da Courses basligi goruntulenir ve tiklanir
    * courses sayfasına gidip text (Courses) görüntülenir
    * Courses sayfasında search textBox ve search buton görüntülenir
    * Courses sayfasında "Filter items" butonu  görüntülenir
    * Filtreleme seçenekleri işaretlenir
    * Courses sayfasında "Filter items" butonu  tıklanır


  Scenario: TC_33.5 Secilen kursların fiyat , tarih,ders adı,ınstructor bilgileri gorunurluk testi
    * Kullanici login sayfasina gider
    * Kullanici "abcd@abcd.com" ve "Abcd.1234" ile login olur
    * Dashboard menu header da Courses basligi goruntulenir ve tiklanir
    * courses sayfasına gidip text (Courses) görüntülenir
    * Courses sayfasında search textBox ve search buton görüntülenir
    * Courses sayfasında "Filter items" butonu  görüntülenir
    * Filtreleme seçenekleri işaretlenir
    * Courses sayfasında "Filter items" butonu  tıklanır
    * Secilen kursların fiyatı görüntülenir
    * Secilen kursların tarih  bilgileri goruntulenir
    * Secilen kursların ders adı bilgileri goruntulenir
    * Secilen kursların ınstructor bilgileri goruntulenir


  Scenario: TC_33.6 "Add to card" ve "Buy now" butonları ve Kursla ilgili detaylı bilgiler görünürlük testi
    * Kullanici login sayfasina gider
    * Kullanici "abcd@abcd.com" ve "Abcd.1234" ile login olur
    * Dashboard menu header da Courses basligi goruntulenir ve tiklanir
    * courses sayfasına gidip text (Courses) görüntülenir
    * Courses sayfasında search textBox ve search buton görüntülenir
    * Courses sayfasında "Filter items" butonu  görüntülenir
    * Filtreleme seçenekleri işaretlenir
    * Courses sayfasında "Filter items" butonu  tıklanır
    * Secilen kursların fiyatı görüntülenir
    * Secilen kursların tarih  bilgileri goruntulenir
    * Secilen kursların ders adı bilgileri goruntulenir
    * Secilen kursların ınstructor bilgileri goruntulenir
    * istenen kurs secildiginde kurs sayfası görüntülenir
    * kurs sayfasında add to card  görüntülenir
    * kurs sayfasında buy now butonu görüntülenir
    * Kursla ilgili detaylı bilgiler görüntülenir
    * kursun puanlaması görüntülenir
    * kurs ıle ilgili yorum sayfası görüntülenir
    * instructor'a ait profil sayfası görüntülenir


  Scenario:TC_33.7 Kursu satın alma testi
    * Kullanici login sayfasina gider
    * Kullanici "abcd@abcd.com" ve "Abcd.1234" ile login olur
    * Dashboard menu header da Courses basligi goruntulenir ve tiklanir
    * courses sayfasına gidip text (Courses) görüntülenir
    * Courses sayfasında search textBox ve search buton görüntülenir
    * Courses sayfasında "Filter items" butonu  görüntülenir
    * Filtreleme seçenekleri işaretlenir
    * Courses sayfasında "Filter items" butonu  tıklanır
    * istenen kurs secildiginde kurs sayfası görüntülenir
    * Buy now butonu tıklanır
    * Account charge butonu tıklanır
    * start payment butonu tıklanır
    * Ödeme sonuç sayfası açılır
    * Your payment successfully done... mesajı görüntülenir
