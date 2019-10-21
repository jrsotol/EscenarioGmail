#language: es

  Característica: Revisar bandeja de salida
    Como usuario web
    Quiero ingresar al correo de gmail
    A revisar mi bandeja de enviados


@RunnerTags
  Escenario: Revision de bandeja de salida
    Dado que usuario quiere ingresar a su jrsotol@unal.edu.co gmail
    Cuando el lo ingrese debera ingresar de nuevo su xkRG96dGFh y jrsotol
    Y  dirigirse a la bandeja de correos enviados
    Entonces el deberia ver el Mensaje nuevo de redactar mensaje
