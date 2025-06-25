Feature US_033 Kayıtlı kullanıcı olarak kurslar seçimi yapabilme

  Scenario: TC_33.1 Anasayfada 'Courses' linki görünürlük test
    Given kullanici anasayfaya gider    * Kullanici login sayfasina gider
    * Kullanici {string} ve {string} ile login olurKullanıcı adı ve password yazılır ve login butonuna tıklanır
    * Dashbord görüntülenir
    * Header da bulunan home linki tıklanır
    * Anasayfada 'Courses' linki görüntülenir.

  Scenario:TC_33.2 Text (Courses) görünürlük testi
    Given Ana sayfaya gidilir
    * Anasayfa header da "login" butonu görüntülenir
    * Login butonu tıklanır
    * Kullanıcı adı ve password yazılır ve login butonuna tıklanır
    * Dashbord görüntülenir
    * Header da bulunan home linki tıklanır
    * Ana sayfaya gidilir
    * Anasayfada 'Courses' linki görüntülenir.
    * courses sayfasına gidip text (Courses) görüntülenir

  Scenario:TC_33.3 Courses sayfasında search textBox ve search buton görünürlük testi
    Given Ana sayfaya gidilir
    * Anasayfa header da "login" butonu görüntülenir
    * Login butonu tıklanır
    * Kullanıcı adı ve password yazılır ve login butonuna tıklanır
    * Dashbord görüntülenir
    * Header da bulunan home linki tıklanır
    * Ana sayfaya gidilir
    * Anasayfada 'Courses' linki görüntülenir.
    * courses sayfasına gidip text (Courses) görüntülenir
    * Courses sayfasında search textBox ve search buton görüntülenir

  Scenario:TC_33.4 Kurs secmeden önce filtreleme işlemleri testi
    Given Ana sayfaya gidilir
    * Anasayfa header da "login" butonu görüntülenir
    * Login butonu tıklanır
    * Kullanıcı adı ve password yazılır ve login butonuna tıklanır
    * Dashbord görüntülenir
    * Header da bulunan home linki tıklanır
    * Ana sayfaya gidilir
    * Anasayfada 'Courses' linki görüntülenir.
    * Linke tıklandıgında ilgili sayfaya gidip text (Courses) görüntülenir
    * Courses sayfasında search textBox ve search buton görüntülenir
    * Courses sayfasında "Filter items" butonu  görüntülenir
    * Filtreleme seçenekleri işaretlenir
    * Courses sayfasında "Filter items" butonu  tıklanır


  Scenario: TC_33.5 Secilen kursların fiyat , tarih,ders adı,ınstructor bilgileri gorunurluk testi
    Given Ana sayfaya gidilir
    * Anasayfa header da "login" butonu görüntülenir
    * Login butonu tıklanır
    * Kullanıcı adı ve password yazılır ve login butonuna tıklanır
    * Dashbord görüntülenir
    * Header da bulunan home linki tıklanır
    * Ana sayfaya gidilir
    * Anasayfada 'Courses' linki görüntülenir.
    * Linke tıklandıgında ilgili sayfaya gidip text (Courses) görüntülenir
    * Courses sayfasında search textBox ve search buton görüntülenir
    * Courses sayfasında "Filter items" butonu  görüntülenir
    * Filtreleme seçenekleri işaretlenir
    * Courses sayfasında "Filter items" butonu  tıklanır
    * Secilen kursların fiyatı görüntülenir
    * Secilen kursların tarih  bilgileri goruntulenir
    * Secilen kursların ders adı bilgileri goruntulenir
    * Secilen kursların ınstructor bilgileri goruntulenir



  Scenario: TC_33.6 "Add to card" ve "Buy now" butonları ve Kursla ilgili detaylı bilgiler görünürlük testi
    Given Ana sayfaya gidilir
    * Anasayfa header da "login" butonu görüntülenir
    * Login butonu tıklanır
    * Kullanıcı adı ve password yazılır ve login butonuna tıklanır
    * Dashbord görüntülenir
    * Header da bulunan home linki tıklanır
    * Ana sayfaya gidilir
    * Anasayfada 'Courses' linki görüntülenir.
    * Linke tıklandıgında ilgili sayfaya gidip text (Courses) görüntülenir
    * Courses sayfasında search textBox ve search buton görüntülenir
    * Courses sayfasında "Filter items" butonu  görüntülenir
    * Filtreleme seçenekleri işaretlenir
    * Courses sayfasında "Filter items" butonu  tıklanır
    * Secilen kursların fiyatı görüntülenir
    * Secilen kursların tarih  bilgileri goruntulenir
    * Secilen kursların ders adı bilgileri goruntulenir
    * Secilen kursların ınstructor bilgileri goruntulenir
    * istenen kurs secildiginde kurs sayfası görüntülenir
    * kurs sayfasında add to card ve buy now butonları görüntülenir
    * Kursla ilgili detaylı bilgiler görüntülenir
    * kursun puanlaması görüntülenir
    * kurs ıle ilgili yorum yapılır
    * instructor'a ait profil sayfası görüntülenir


  Scenario:TC_33.7 Kursu satın alma testi
    Given Ana sayfaya gidilir
    * Anasayfa header da "login" butonu görüntülenir
    * Login butonu tıklanır
    * Kullanıcı adı ve password yazılır ve login butonuna tıklanır
    * Dashbord görüntülenir
    * Header da bulunan home linki tıklanır
    * Ana sayfaya gidilir
    * Anasayfada 'Courses' linki görüntülenir.
    * Linke tıklandıgında ilgili sayfaya gidip text (Courses) görüntülenir
    * Courses sayfasında search textBox ve search buton görüntülenir
    * Courses sayfasında "Filter items" butonu  görüntülenir
    * Filtreleme seçenekleri işaretlenir
    * Courses sayfasında "Filter items" butonu  tıklanır
    * Listeden kurs seçililr tıklanarak kurs sayfası açılır
    * Buy now butonu tıklanır
    * Ödeme sayfası görüntülenir
    * Account charge butonu tıklanır
    * start payment butonu tıklanır
    * Your payment successfully done... mesajı görüntülenir



