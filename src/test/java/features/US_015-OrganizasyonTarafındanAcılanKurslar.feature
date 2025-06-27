Feature: Organizations Bölümünün Görüntülenmesi

  Background:
    Given Kullanici ana sayfaya gider

  @Organizations
  Scenario: TC01 - Organizations başlığı görünür olmalı
    Then Anasayfada Organizations başlığı görünür olmalıdır

  @Organizations
  Scenario: TC02 - All Organizations butonu görünür ve aktif olmalı
    Then All Organizations butonu görünür ve aktif olmalıdır

  @Organizations
  Scenario: TC03 - Organizations başlığı altındaki slider görünür ve aktif olmalı
    Then Organizations başlığı altındaki slider görünür ve aktif olmalıdır