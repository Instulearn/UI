Feature: Kullanıcının Bildirimlerini Görüntüleyebilmesi

  Background:
    Given Kullanici login sayfasina gider
    And Kullanici "busra.teacher1@instulearn.com" ve "Busra.1469" ile login olur

  @Notifications
  Scenario: TC01 - Dashboard'da 'Notifications' linki görünür ve aktif olmalı
    Then Dashboard sayfasinda Notifications linki görünür ve aktif olmalıdır

  @Notifications
  Scenario: TC02 - Notifications linkine tıklanınca başlık metni görüntülenmeli
    When Kullanici Notifications linkine tiklar
    Then Notifications sayfasinda "Notifications" başlığı görünür olmalıdır

  @Notifications
  Scenario: TC03 - Bildirim listesinde seçilen bildirim View ikonu ile detaylı görüntülenebilir olmalı
    When Kullanici bildirim listesinden bir View ikonuna tiklar
    Then Bildirimin detaylari görünür olmalıdır

  @Notifications
  Scenario: TC04 - Daha fazla bildirim için sayfa geçişi yapılabilmeli
    When Kullanici Notifications sayfasinda ileri sayfa butonuna tiklar
    Then Yeni bildirim sayfasi görünür olmalıdır

  @Notifications
  Scenario: TC05 - Mark all notifications as read ikonu görünür ve aktif olmalı, tüm bildirimler okundu işaretlenebilmeli
    When Kullanici "Mark all notifications as read" ikonuna tiklar
    Then Tum bildirimler okundu olarak isaretlenmelidir