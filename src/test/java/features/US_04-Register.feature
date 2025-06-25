Feature: US_04 Register olma islemleri


  @positiveRegister
  Scenario: Ziyaretci register olma testi
  Given Kullanici anasayfaya gider
  When Register butona tiklanir
  When Register formundaki bütün bilgiler gecerli verilerle doldurulur
  Then I agree with terms&rules secilir
  And Signup butonuna tiklanir
  And Yönlendirilen sayfada 'Full Name alanina' yazilan ismin görüldügü dogrulanir

  @TC_004.1
  Scenario: Register butonu görünürlük testi
  Given Kullanici anasayfaya gider
  And Register butonunun görünürlügü dogrulanir

  @TC_004.2
  Scenario: Register URL testi
  Given Kullanici anasayfaya gider
  When Register butona tiklanir
  Then Register butonuna tiklandiginda acilan sayfanin URL'inde 'register' kelimesinin yer aldigi dogrulanir

  @TC_004.3
  Scenario: Register page sol taraftaki foto görünürlük testi
  Given Kullanici anasayfaya gider
  When Register butona tiklanir
  Then Sayfanin solunda yer alan resmin görünürlügü dogrulanir