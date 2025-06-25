Feature: [US_012] ınstructorları inceleyip randevu oluşturabilme

  Scenario: TC_012.01 Sayfanın altındaki instructors metni görünürlüğü kontrol edilir
    Given kullanici anasayfaya gider
    Then Kullanici sayfanin altindaki "Instructors" metninin gorunur oldugunu dogrular



  Scenario: TC_012.02 "All Instructors" butonu görünürlük Testi
    Given kullanici anasayfaya gider
    Then Anasayfa body bölümünde All Instructors butonu görüntülene kadar sayfa aşağı indirilir
    When All Instructors butonu tıklanır



  Scenario: TC_12.3 Instructor bilgi kartlarının oldugu slider görünürlük testi
    Given kullanici anasayfaya gider
    Then Kullanici sayfanin altindaki "Instructors" metninin gorunur oldugunu dogrular
    When Instructors baslığı altında slider  kontrol edilir
    Then Slider ileri ve geri okları ya da swipe fonksiyonu test edilerek kart geçişleri denenir


  Scenario: [TC_12.4] "Reserve a live meeting" butonu görünürlük ve aktiflik testi
    Given kullanici anasayfaya gider
    Then Kullanici sayfanin altindaki "Instructors" metninin gorunur oldugunu dogrular
    When Instructors baslığı altında slider  kontrol edilir
    Then Slider ileri ve geri okları ya da swipe fonksiyonu test edilerek kart geçişleri denenir
    When Beğeni yıldızlarının bulunup bulunmadigi kontrol edilir
    When Instructor kartları içinde  "Reserve a live meeting" butonu görüntülenir
    When Instructor kartları içinden birine ait   "Reserve a live meeting" butonu tıklanır
    Then Instructor a ait sayfada "Reserve a live meeting" başlığı altında  rezervasyon için takvim görüntülenir ve tarih seçilir
    When Tarih şeçimi sonrasında "Pick a time" başlığı altında saat seçenekleri görülür.
    Then Meeting Type seçiminden sonra "Reserve a meeting" butonu görüntülenir
    Then Rezervasyonun onaylandığına dair mesaj alınır




