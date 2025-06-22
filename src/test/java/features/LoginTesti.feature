Feature: Girilen email ve password ile login olunur


  @alpaylogin
  Scenario: Login Olma Testi
    Given kullanici login sayfasina gider
    Then kullanici "alpay.student@instulearn.com" ve "Learn.1406" ile login olur

