
Feature: US_013 Anasayfada sertifika ve randevu işlemleri yönetilir

  @us13
  Scenario: TC_13.1 Anasayfada Validate Certificates karti gorunurluk Testi
    Given Kullanici anasayfaya gider
    When "Validate Certificates" kartinin gorunur olup olmadigini kontrol eder.
    Then Validate Certificate kartina tiklar

  @us13
  Scenario: TC_13.2 Anasayfada Reserve a meeting karti islevsellik Testi
    Given Kullanici anasayfaya gider
    When "Reserve a meeting" kartinin sayfada gorunur olup olmadigini kontrol eder.
    Then Reserve a meeting kartina tiklar


