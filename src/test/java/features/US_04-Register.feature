Feature: US_04 Register olma islemleri


    @tugba
  Scenario: TC_004.16
  Given Kullanici anasayfaya gider
  When Register butona tiklanir
  When Formdaki bütün bilgiler gecerli verilerle doldurulur
  Then I agree with terms&rules secilir
  And Signup butonuna tiklanir
  And Yönlendirilen sayfada 'Full Name alanina' yazilan ismin görüldügü dogrulanir