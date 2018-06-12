alumno_cierre(josue).
findall(X, alumno(X), L), maplist(alumno, L).
asignado(ia,josue).
asignado(ia,diego).
escuela_vacaciones(junio).
escuela_vacaciones(julio).
curso_simple(ia).
curso_simple(mate1).
curso_doble(mate1).
curso_doble(it).
curso_finde(it).
curso_finde(ia).
ubicacion_curso(ia,Edificio,Salon).
ubicacion_lab(ia,Edificio,Salon).

info_curso(C,Edificio,Salon,EdificioLab,SalonLab,Tipo,Jornada,HorasDiarias,Precio,Cupo).





/*
	JAVA JPL
*/

alumno(X),numero_creditos(X,Y),Y>=250