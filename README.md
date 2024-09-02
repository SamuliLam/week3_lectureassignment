# week3_lectureassignment

## a. What does the assertArrayEquals method do?
Kyseinen metodi tarkistaa ovatko kaksi taulukkoa yhtäläisiä. Jotta taulukot voivat olla yhtäläisä, niillä pitää oolla sama pituus, eli taulukoissa täytyy olla sama määrä alkioita. Lisäksi Taulukkojen tulee sisältää kaikki samat alkiot samassa järjestyksessä.

## b. What will happen if the arrays a1 and a2 are not equal in testSingleDimensionalArrayEquality?
Jos taulukot eivät ole yhtäläisiä, testimetodi ei läpäise testiä, koska taulukoissa on jotain eroavaisuutta. assertArrayEquals metodi heittää AssertionError-virheen ja virheeseen liittyvä viesti sisältää testin epäonnistumisen syyn. 

## c. How does the assertArrayEquals method handle multi-dimensional arrays as seen in testMultiDimensionalArrayEquality?
assertArrayEquals toimii rekursiivisesti ja varmistaa, että jokainen vastaava alitaulukko ja niiden sisällä olevat alkiot ovat yhtä suuria.
