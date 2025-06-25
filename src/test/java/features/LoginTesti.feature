Feature: Girilen email ve password ile login olunur


  @alpaylogin
  Scenario: Login Olma Testi
    Given Kullanici login sayfasina gider
    Then Kullanici "alpay.student@instulearn.com" ve "Learn.1406" ile login olur
