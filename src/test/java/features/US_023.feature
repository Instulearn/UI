
 Feature: Instructors olarak kurs paketi oluşturulup yönetilir

   Scenario: TC_23.1 Dashboard sideBar'da Course Bundles menü başlığı altındaki 'New' linkinin aktiflik testi
     Given kullanıcı login sayfasına gider
     When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
     Then dashboard sideBar da course bundles butona tıklanır
     Then açılan menüde new linkine tıklanır
     And  ilgili sayfanın açıldığı doğrulanır

   Scenario:  TC_23.2 New Course sayfasında Basic Info icin Gerekli Form Bilgilerinin girileceği alanların testi
     Given kullanıcı login sayfasına gider
     When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
     Then dashboard sideBar da course bundles butona tıklanır
     Then açılan menüde new linkine tıklanır
     Then basic info altındaki Title text box'ına ilgili data girilir
     Then basic info altındaki SEO Meta Description text box'ına ilgili data girilir
     Then thumbnail text box'a ilgili data girilir
     Then cover image text box'ına ilgili data girilir
     Then sayfa aşağıya çekilir
     Then Basic info altındaki Description text box'ına tıklanır ve ilgili data girilir.
     And  next butonuna tıklanır

   Scenario: TC_23.3 Private, Next, Previous, Send for Review, Save as Draft, Delete butonları aktiflik testi
     Given kullanıcı login sayfasına gider
     When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
     Then dashboard sideBar da course bundles butona tıklanır
     Then açılan menüde new linkine tıklanır
     Then basic info altındaki Title text box'ına ilgili data girilir
     Then basic info altındaki SEO Meta Description text box'ına ilgili data girilir
     Then thumbnail text box'a ilgili data girilir
     Then cover image text box'ına ilgili data girilir
     Then sayfa aşağıya çekilir
     Then Basic info altındaki Description text box'ına tıklanır ve ilgili data girilir.
     And  next butonuna tıklanır
     Then previous butonu görüntülenir
     Then next butonu görüntülenir
     And  send for review görüntülenir
     Then save as draft görüntülenir

   Scenario: TC_23.4 Extra Information için gerekli form bilgileri düzenleme testi
     Given kullanıcı login sayfasına gider
     When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
     Then extra information sayfasına gidilir
     Then category text box'ına tıklanır
     Then dıgıtal marketing linkine tıklanır
     And  next butonuna tıklanır


