Feature: US_034 Instructor Islemleri

  @TC_034.1
  Scenario: Instructor yazisi görünürlük testi
    Given Kullanici login sayfasina gider
    When Kullanici "tugba@tugba.com" ve "abc.12345" ile login olur
    Then Instructors yazisi görünür oldugu dogrulanir
    Then Instructors'a tiklandiginda acilan sayfada Instructors yazisinin yer aldigi dogrulanir

