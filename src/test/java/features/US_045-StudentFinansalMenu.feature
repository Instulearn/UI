Feature: US_045 Student Finansal Menü Bağlantılarının Görünürlüğü ve Fonksiyonelliği

  @us45
  Scenario: TC_45.1 Student Finansal Menu Baglantilari ve Gorunurlugu Testi
    * Kullanici login sayfasina gider
    * Kullanici "alpay.student@instulearn.com" ve "Learn.1406" ile login olur
    * Dashboard menu sidebar da Financial basligi goruntulenir ve tiklanir
    * Financial Summary baglantisina tiklanir ve ilgili sayfanin yuklendigi kontrol edilir
    * Payout baglantisina tiklanir ve henuz tanimli bir hesap yoksa davranis kontrol edilir
    * Ayarlar sayfasindan hesap tanimlanir

  @us45
  Scenario: TC_45.2 Tanimli Hesap Silme Testi
    * Kullanici login sayfasina gider
    * Kullanici "alpay.student@instulearn.com" ve "Learn.1406" ile login olur
    * Dashboard menu sidebar da Financial basligi goruntulenir ve tiklanir
    * Payout baglantisina tiklanir ve henuz tanimli bir hesap yoksa davranis kontrol edilir
    * Tanimli hesap silinir

  @us45
  Scenario: TC_45.3 Hesaba Para Aktarma Testi
    * Kullanici login sayfasina gider
    * Kullanici "alpay.student@instulearn.com" ve "Learn.1406" ile login olur
    * Dashboard menu sidebar da Financial basligi goruntulenir ve tiklanir
    * Charge Account baglantisina tiklanir
    * Odeme yontemi ve tutar girilerek islem tamamlanir

  @us45
  Scenario: TC_45.4 Uyelik Subscribe Kayit Testi
    * Kullanici login sayfasina gider
    * Kullanici "alpay.student@instulearn.com" ve "Learn.1406" ile login olur
    * Dashboard menu sidebar da Financial basligi goruntulenir ve tiklanir
    * Subscribe baglantisina tiklanir
    * Yeni bir uyelik plani secilip olusturulur


