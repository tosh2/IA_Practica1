alumno(josue).
alumno(diego).
alumno(gato).
alumno(juan).
alumno(pedro).

numero_creditos(josue,250).
numero_creditos(diego,250).
numero_creditos(gato,249).
numero_creditos(juan,150).
numero_creditos(pedro,300).

alumno_cierre(X) :-
	alumno(X),
	numero_creditos(X,Y),Y>=250.

asigno(josue,ia).
asigno(pedro,ia).

asignado(C,N) :-
	asigno(N,C),alumno(N).

mes(junio).
mes(julio).
mes(diciembre).

escuela_vacaciones(X) :-
	mes(X),
	X=junio;
	X=diciembre.

curso(ia).
curso(it).
curso(mate1).
curso(prepa1).

duracion(ia,2).
duracion(it,2).
duracion(mate1,4).

curso_simple(X) :-
	curso(X),
	duracion(X,Y),Y=2.

curso_doble(X) :-
	curso(X),
	duracion(X,Y),Y=4.

precio(ia,115).
precio(mate1,230).

tipo_curso(it,especial,fin_semana).
tipo_curso(mate1,regular,entre_semana).
tipo_curso(ia,regular,entre_semana).
tipo_curso(prepa1,acreditado,entre_semana).

cupo(mate1,110).
cupo(ia,110).
cupo(prepa1,50).


curso_finde(C) :-
	tipo_curso(C,E,_),
	E=especial.

laboratorio(ia,t1,liii1).
laboratorio(mate1,t3,301).

ubicacion(ia,t3,209).
ubicacion(mate1,t3,109).

ubicacion_curso(C,X,Y) :-
	curso(C),ubicacion(C,X,Y).

ubicacion_lab(C,X,Y) :-
	curso(C),laboratorio(C,X,Y).

info_curso(C,A,B,D,E,F,G,H,I,J) :-
	curso(C),
	ubicacion(C,A,B),
	laboratorio(C,D,E),
	tipo_curso(C,F,G),
	duracion(C,H),
	precio(C,I),
	cupo(C,J).













