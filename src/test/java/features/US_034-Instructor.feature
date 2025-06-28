Feature: US_034 Instructor Islemleri

  @TC_034.1
  Scenario: Instructor tiklanabilirlik ve dogru sayfaya yönlendirme testi
    Given Kullanici login sayfasina gider
    When Kullanici "tugba@tugba.com" ve "abc.12345" ile login olur
    Then Instructors yazisi görünür oldugu dogrulanir
    And Instructors yazisina tiklanir
    Then Acilan sayfada Instructors yazisinin yer aldigi dogrulanir

  @TC_034.2
  Scenario: Search butonu testi
    Given Kullanici login sayfasina gider
    When Kullanici "tugba@tugba.com" ve "abc.12345" ile login olur
    And Instructors yazisina tiklanir
    Then Search textbox görünürlügü dogrulanir
    Then search butonunun görünürlügü dogrulanir
    And Search box'a "Seraphina Lawson" yazilip aratilir
    And Search box'a tiklanir
    Then Gelen sonucun "Seraphina Lawson" icerdigi dogrulanir

  @TC_034.3
  Scenario: Kategori secme testi
    Given Kullanici login sayfasina gider
    When Kullanici "tugba@tugba.com" ve "abc.12345" ile login olur
    And Instructors yazisina tiklanir
    And Categories'e tiklanir
    And Categories'in icinde 'Web Design'a tiklanir
    Then Acilan URL'in "Web%20Design" kelimesini icerdigi dogrulanir

  @TC_034.5
  Scenario: Randevu talebi olusturma testi
    * Kullanici login sayfasina gider
    * Kullanici "tugba@tugba.com" ve "abc.12345" ile login olur
    * Dashboard menu sidebar da Financial basligi goruntulenir ve tiklanir
    * Charge Account baglantisina tiklanir
    * Odeme yontemi ve tutar girilerek islem tamamlanir
    * Instructors yazisina tiklanir
    * Search box'a "Sawyer Emerson" yazilip aratilir
    * Search box'a tiklanir
    * Reserve a meeting e tiklanir
    * Uygun bir tarih secilir
    * Saat secilir
    * Meeting Type secilir
    * Reserve a meeting e tekrar tiklanir
    * Checkout butonuna tiklanir
    * Acoount Charge'a tiklanir
    * Start Payment'a tiklanir
    * Yönlendirilen sayfada My Panel butonunun görünür ve aktif oldugu dogrulanir

  @TC_034.4
  Scenario: Randevu talebi olusturma testi
    Given Kullanici login sayfasina gider
    When Kullanici "tugba@tugba.com" ve "abc.12345" ile login olur
    And Instructors yazisina tiklanir
    Then Secilen instructor'in fiyat, ders adi, begeni bilgilerinin görüldügü dogrulanir









