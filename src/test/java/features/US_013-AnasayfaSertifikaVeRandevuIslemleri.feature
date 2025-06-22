
Feature: US_013 Anasayfada sertifika ve randevu işlemleri yönetilir

  @google
  Scenario: TC_13.1 Anasayfada Validate Certificates karti gorunurluk Testi
    Given kullanici anasayfaya gider
    When "Validate Certificates" kartinin gorunur olup olmadigini kontrol eder.
    Then Validate Certificate kartina tiklar

  @google
  Scenario: TC_13.2 Anasayfada Reserve a meeting karti islevsellik Testi
    Given kullanici anasayfaya gider
    When "Reserve a meeting" kartinin sayfada gorunur olup olmadigini kontrol eder.
    Then Reserve a meeting kartina tiklar


