CREATE TABLE tb_ExtraUsuario (
    UUID_Usuario VARCHAR2(25) PRIMARY KEY,
    nombre_usuario VARCHAR2(50) NOT NULL,
    apellido_usuario VARCHAR2(50) NOT NULL,
    correo_usuario VARCHAR2(50) NOT NULL,
    contra_usuario VARCHAR2(50) NOT NULL,
    edad_usuario INT NOT NULL
);

CREATE TABLE tb_Libro (
    UUID_libro VARCHAR2(25) PRIMARY KEY,
    nombre_libro VARCHAR2(50) NOT NULL,
    autor VARCHAR2(50) NOT NULL,
    año_publicacion NUMBER NOT NULL,
    estado_libro VARCHAR2(50) NOT NULL,
    isbm INT NOT NULL,
    genero_literario VARCHAR2(50) NOT NULL,
    cantidad_pag NUMBER NOT NULL,
    editorial VARCHAR2(50) NOT NULL
);
