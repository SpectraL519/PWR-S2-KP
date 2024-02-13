#include<iostream>

using namespace std;

// Klasa jest abstrakcyjna jesli ma metode abstrakcyjn�
class Pojazd {    
public:
	// Spos�b definiowania metody abstrakcyjnej
	virtual void PodajCene()=0;
};

class Ciezarowy : public Pojazd{
public:
	int PodajLadownosc(){
     return 500;
    }   
	 void PodajCene(){
        cout << "30000" << endl;
    }
};

class SamochodDostawczy : public Pojazd{   
public:
	int PodajIloscMiejsc(){
        return 8;
    }
    int PodajLadownosc(){
        return 500;
    }
    void PodajCene(){
        cout << "60000" << endl;
    }
};

int main(int argc, char* argv[]) {

	Ciezarowy *c = new Ciezarowy();
	Pojazd *p = new SamochodDostawczy();
	p->PodajCene();

	// Niepoprawnie. Nie mo�na tworzy� obiektu dla klasy abstrakcyjnej
	//Pojazd *p2 = new Pojazd();
	
	// Mo�e byc tablica dla typ�w abstrakcyjnych
	Pojazd* p1[2] = {c,p};
	p1[0]->PodajCene();

	Pojazd** p2 = new Pojazd*[3];
	p2[0]=p;
	p2[1]=c;

	p1[0]->PodajCene();
	p1[1]->PodajCene();

}