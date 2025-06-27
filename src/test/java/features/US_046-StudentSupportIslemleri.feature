Feature: US_046 Student Dashboard da Support Islemlerini Yonetme

  @us46
  Scenario: TC_46.1 Dashboard sidebarda Support basligi Testi
    * Kullanici login sayfasina gider
    * Kullanici "alpay.student@instulearn.com" ve "Learn.1406" ile login olur
    * Dashboard menu sidebar da support menusu oldugunu kontrol eder
    * Support basligina tiklanir
    * Support basliginin altindaki her bir baglantiya tiklanir
    * Logout butonuna tiklanir


  @us46
  Scenario: TC_46.2 New baglantisi uzerinden destek istegi gonderimi
    * Kullanici login sayfasina gider
    * Kullanici "alpay.student@instulearn.com" ve "Learn.1406" ile login olur
    * Dashboard menu sidebar da support menusu oldugunu kontrol eder
    * Support basligina tiklanir
    * New alt basligina tiklanir
    * Subject alanına bilgi girilir
    * Type secimi yapilir
    * Department secilir
    * Message yazilir
    * Gonder butonuna tiklanir
    * Logout butonuna tiklanir

  @us46
  Scenario: TC_46.3 Courses Support goruntulenmesi ve mesaj gecmisi duzenlenmesi
    * Kullanici login sayfasina gider
    * Kullanici "alpay.student@instulearn.com" ve "Learn.1406" ile login olur
    * Dashboard menu sidebar da support menusu oldugunu kontrol eder
    * Support basligina tiklanir
    * Courses support alt basligina tiklanir
    * Ekrandaki board ogeleri kontrol edilir

    * Subject alanına bilgi girilir
    * Type secimi yapilir
    * Department secilir
    * Message yazilir
    * Gonder butonuna tiklanir
    * Logout butonuna tiklanir