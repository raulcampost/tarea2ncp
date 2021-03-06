PGDMP     %                    w            tareaNCapas    10.8    10.8                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false                       1262    16402    tareaNCapas    DATABASE     �   CREATE DATABASE "tareaNCapas" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_El Salvador.1252' LC_CTYPE = 'Spanish_El Salvador.1252';
    DROP DATABASE "tareaNCapas";
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false                       0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12924    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false                       0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            �            1259    16413    empleado    TABLE     �   CREATE TABLE public.empleado (
    id_empleado integer NOT NULL,
    empleado character(30),
    edad integer,
    genero character(30),
    estado character(100),
    id_sucursalpk integer
);
    DROP TABLE public.empleado;
       public         postgres    false    3            �            1259    16464    empleado_id_empleado_seq    SEQUENCE     �   ALTER TABLE public.empleado ALTER COLUMN id_empleado ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.empleado_id_empleado_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public       postgres    false    198    3            �            1259    16449    empleado_sec    SEQUENCE     �   CREATE SEQUENCE public.empleado_sec
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 99999999999999
    CACHE 1;
 #   DROP SEQUENCE public.empleado_sec;
       public       postgres    false    3            �            1259    16408    sucursal    TABLE     �   CREATE TABLE public.sucursal (
    id_sucursal integer NOT NULL,
    nombre character(100),
    ubicacion character(100),
    hentrada character(30),
    hsalida character(30),
    mesas integer,
    gerente character(100)
);
    DROP TABLE public.sucursal;
       public         postgres    false    3            �            1259    16466    sucursal_id_sucursal_seq    SEQUENCE     �   ALTER TABLE public.sucursal ALTER COLUMN id_sucursal ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.sucursal_id_sucursal_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public       postgres    false    197    3            �            1259    16451    sucursal_sec    SEQUENCE     �   CREATE SEQUENCE public.sucursal_sec
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 99999999999999
    CACHE 1;
 #   DROP SEQUENCE public.sucursal_sec;
       public       postgres    false    3            �            1259    16403    usuario    TABLE     u   CREATE TABLE public.usuario (
    id_usuario integer NOT NULL,
    usuario character(30),
    clave character(20)
);
    DROP TABLE public.usuario;
       public         postgres    false    3            �            1259    16468    usuario_id_usuario_seq    SEQUENCE     �   ALTER TABLE public.usuario ALTER COLUMN id_usuario ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.usuario_id_usuario_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public       postgres    false    196    3            �            1259    16453    usuario_sec    SEQUENCE     �   CREATE SEQUENCE public.usuario_sec
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 99999999999999
    CACHE 1;
 "   DROP SEQUENCE public.usuario_sec;
       public       postgres    false    3                      0    16413    empleado 
   TABLE DATA               ^   COPY public.empleado (id_empleado, empleado, edad, genero, estado, id_sucursalpk) FROM stdin;
    public       postgres    false    198   �                 0    16408    sucursal 
   TABLE DATA               e   COPY public.sucursal (id_sucursal, nombre, ubicacion, hentrada, hsalida, mesas, gerente) FROM stdin;
    public       postgres    false    197   �                  0    16403    usuario 
   TABLE DATA               =   COPY public.usuario (id_usuario, usuario, clave) FROM stdin;
    public       postgres    false    196   <                  0    0    empleado_id_empleado_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.empleado_id_empleado_seq', 2, true);
            public       postgres    false    202                       0    0    empleado_sec    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.empleado_sec', 1, false);
            public       postgres    false    199                       0    0    sucursal_id_sucursal_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.sucursal_id_sucursal_seq', 4, true);
            public       postgres    false    203                       0    0    sucursal_sec    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.sucursal_sec', 1, false);
            public       postgres    false    200                       0    0    usuario_id_usuario_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.usuario_id_usuario_seq', 1, false);
            public       postgres    false    204                       0    0    usuario_sec    SEQUENCE SET     :   SELECT pg_catalog.setval('public.usuario_sec', 1, false);
            public       postgres    false    201            �
           2606    16417    empleado empleado_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.empleado
    ADD CONSTRAINT empleado_pkey PRIMARY KEY (id_empleado);
 @   ALTER TABLE ONLY public.empleado DROP CONSTRAINT empleado_pkey;
       public         postgres    false    198            �
           2606    16412    sucursal sucursal_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.sucursal
    ADD CONSTRAINT sucursal_pkey PRIMARY KEY (id_sucursal);
 @   ALTER TABLE ONLY public.sucursal DROP CONSTRAINT sucursal_pkey;
       public         postgres    false    197            �
           2606    16407    usuario usuario_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (id_usuario);
 >   ALTER TABLE ONLY public.usuario DROP CONSTRAINT usuario_pkey;
       public         postgres    false    196            �
           2606    16418    empleado id_sucursal    FK CONSTRAINT     �   ALTER TABLE ONLY public.empleado
    ADD CONSTRAINT id_sucursal FOREIGN KEY (id_sucursalpk) REFERENCES public.sucursal(id_sucursal);
 >   ALTER TABLE ONLY public.empleado DROP CONSTRAINT id_sucursal;
       public       postgres    false    2691    198    197               /   x�3�,JT�8M9s��Ks2��+HL.�,�.G5������� ���         c   x��51�LN��I�J,V�!�4RH,��`K��K���,J,�Q(�EJ"5݅�tMLA^L;� A^�X��F���0��9�J��2���*4����� j�          3   x�3�,J,�qH�M���K��U@`itA.#�ļ����|aҨ�b���� �J     