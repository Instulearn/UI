Feature: Dashboard sidebar'da Marketing başlığı altında Discounts ve Promotions linkleri görünür ve aktif olmalı
  Scenario: Dashboard sidebar'da Marketing başlığı altında Discounts ve Promotions linkleri görünür ve aktif olmalı
    * Kullanıcı dashboard sayfasına giriş yapar
    * Sidebar'da "Marketing" başlığı altında "Discounts" linki görünür ve aktif olmalı
    * "Promotions" linki görünür ve aktif olmalı
    * Kullanıcı dashboard sayfasında "Discounts" linkine tıklar
    * Yeni kurs indirimi oluşturma formu görüntülenir
    * İndirim oluşturma formundaki "Title" alanına başlık girilir
    * "Course" dropdown'dan bir kurs seçilir
    * "Amount" alanına yüzde indirim girilir
    * "From" ve "To" tarihleri seçilir
    * "Create" butonuna tıklanır
    * Kullanıcı dashboard sayfasında "Promotions" linkine tıklar
    * Promosyon planları listesi görünür olmalı
    * Kullanıcı bir promosyon planını seçebilir olmalı
    * Kullanıcı bir promosyon planına tıklar
    * Kullanıcı popup'taki "Select a course" dropdown'dan "Postman" kursunu secer
    * "Pay" butonuna tıklar
    * Kullanıcı checkout sayfasına yönlendirilir
    * Kullanıcı bir ödeme yöntemi seçer
    * "Start Payment" butonuna tıklarr
    * Ödeme işlemi tamamlanır ve "Congratulations!" onay mesajı görünür olmalı.
