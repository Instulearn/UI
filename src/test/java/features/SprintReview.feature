Feature: Sprint 1 Review


  @review
  Scenario: Sitede gezinme Testi

    * Kullanici anasayfaya gider
    * Kullanici sayfada asagi dogru hareket eder

    * Sayfa asagi kaydirilarak Testimonials basligina ulasilir
    * Slider kontrol edilir
    * Slider ileri ve geri oklari ya da swipe fonksiyonu test edilerek kart gecisleri denenir
    * İlk gorunen yorum karti incelenir ve kartin uzerinde sirket adinin yer alip almadigi kontrol edilir
    * Puanlama gorselinin bulunup bulunmadigi kontrol edilir
    * Kartin yorum metnini icerip icermedigi kontrol edilir
    * Sayfayi en yukari kaydir
    * Driveri 2 saniye Bekletir
    
    When Register butona tiklanir
    * Driveri 2 saniye Bekletir
    And Register formundaki bütün bilgiler gecerli verilerle doldurulur
    And Driveri 2 saniye Bekletir
    And I agree with terms&rules secilir
    * Driveri 2 saniye Bekletir
    When Signup butonuna tiklanir
    Then Driveri 2 saniye Bekletir
    Then Yönlendirilen sayfada Full Name alanina yazilan ismin görüldügü dogrulanir
    Then Driveri 2 saniye Bekletir

    Then Dashboard paneli acilir
    Then Dashboardda settingse tiklar
    Then İlgili sayfanın açıldığını doğrular
    Then Driveri 3 saniye Bekletir
    Then images link butona tıklanır
    Then Driveri 2 saniye Bekletir
    And sayfa aşağıya kaydırılır ve next butonuna tıklanır
    Then Driveri 2 saniye Bekletir

    And biography text box'a biyografi girilir
    Then Driveri 2 saniye Bekletir
    Then job title text box'a meslek girilir
    Then Driveri 2 saniye Bekletir
    Then next butonuna tıklanır
    Then Driveri 2 saniye Bekletir
    And  add education butona tıklar
    Then Driveri 2 saniye Bekletir
    Then new education tex box'ına ilgili veriyi girer
    Then Driveri 2 saniye Bekletir
    Then new education sayfasındaki save butonuna basar
    Then Driveri 2 saniye Bekletir
    Then next butonuna tıklanır
    Then Driveri 2 saniye Bekletir
    Then add experience butonunun görünür olduğunu doğrular
    Then next butonuna tıklanır
    Then  Driveri 2 saniye Bekletir
    Then SDET(Software Development Engineer in Test) butona tıklanır
    Then Driveri 2 saniye Bekletir
    And sayfa aşağıya kaydırılır ve next butonuna tıklanır
    Then Driveri 2 saniye Bekletir
    Then Select account type check box'ından paypal seçilir
    Then Driveri 2 saniye Bekletir
    And  account holder text box'ına ilgili data girilir
    Then Driveri 2 saniye Bekletir
    Then email text box'ına ilgili data girilir
    Then Driveri 2 saniye Bekletir
    Then sayfa aşağıya çekilir
    Then adress text box'ına ilgili data girilir
    Then Driveri 2 saniye Bekletir
    Then next butonuna tıklanır
    Then Driveri 2 saniye Bekletir

    * Dashboard menu sidebar da Financial basligi goruntulenir ve tiklanir
    * Charge Account baglantisina tiklanir
    * Odeme yontemi ve tutar girilerek islem tamamlanir
    * Driveri 2 saniye Bekletir

    * Dashboard menu header da Courses basligi goruntulenir ve tiklanir
    * courses sayfasına gidip text (Courses) görüntülenir
    * Driveri 2 saniye Bekletir
    * Ilk kursa tiklanir
    * Driveri 2 saniye Bekletir
    * Buy now butonuna tıklanır
    * Driveri 2 saniye Bekletir
    * Account charge butonu tıklanır
    * start payment butonuna tıklanır
    * Driveri 2 saniye Bekletir
    * Your payment successfully done... mesajı görüntülenir
    * Driveri 2 saniye Bekletir
    * Dashboard paneli acilir
    * Driveri 2 saniye Bekletir
    * Dashboard menu sidebar da Financial basligi goruntulenir ve tiklanir
    * Subscribe baglantisina tiklanir
    * Yeni bir uyelik plani secilip olusturulur
    * Dashboard paneli acilir
    * Support basligina tiklanir
    * New alt basligina tiklanir
    * Subject alanına bilgi girilir
    * Type secimi yapilir
    * Department secilir
    * Message yazilir
    * Gonder butonuna tiklanir
    * Dashboard paneli acilir
    * Support basligina tiklanir
    * Ticket Alt basligina tiklanir
    * Bir mesaj secilir ve cevap yazilip kapatilir
    * Logout butonuna tiklanir





