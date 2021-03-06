PGDMP     .    (                w            tareaNCapas    10.8    10.8     �
           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            �
           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            �
           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            �
           1262    16402    tareaNCapas    DATABASE     �   CREATE DATABASE "tareaNCapas" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_El Salvador.1252' LC_CTYPE = 'Spanish_El Salvador.1252';
    DROP DATABASE "tareaNCapas";
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            �
           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12924    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false            �
           0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            �            1259    16413    empleado    TABLE     �   CREATE TABLE public.empleado (
    id_empleado integer NOT NULL,
    nombre character(30),
    edad integer,
    genero boolean,
    estado boolean,
    id_sucursal integer
);
    DROP TABLE public.empleado;
       public         postgres    false    3            �            1259    16408    sucursal    TABLE     �   CREATE TABLE public.sucursal (
    id_sucursal integer NOT NULL,
    nombre character(30),
    ubicacion character(50),
    hentrada character(30),
    hsalida character(30),
    "nMesas" integer,
    "nomGerente" character(30)
);
    DROP TABLE public.sucursal;
       public         postgres    false    3            �            1259    16403    usuario    TABLE     u   CREATE TABLE public.usuario (
    id_usuario integer NOT NULL,
    usuario character(30),
    clave character(20)
);
    DROP TABLE public.usuario;
       public         postgres    false    3            �
          0    16413    empleado 
   TABLE DATA               Z   COPY public.empleado (id_empleado, nombre, edad, genero, estado, id_sucursal) FROM stdin;
    public       postgres    false    198   �       �
          0    16408    sucursal 
   TABLE DATA               m   COPY public.sucursal (id_sucursal, nombre, ubicacion, hentrada, hsalida, "nMesas", "nomGerente") FROM stdin;
    public       postgres    false    197   �       �
          0    16403    usuario 
   TABLE DATA               =   COPY public.usuario (id_usuario, usuario, clave) FROM stdin;
    public       postgres    false    196   �       y
           2606    16417    empleado empleado_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.empleado
    ADD CONSTRAINT empleado_pkey PRIMARY KEY (id_empleado);
 @   ALTER TABLE ONLY public.empleado DROP CONSTRAINT empleado_pkey;
       public         postgres    false    198            w
           2606    16412    sucursal sucursal_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.sucursal
    ADD CONSTRAINT sucursal_pkey PRIMARY KEY (id_sucursal);
 @   ALTER TABLE ONLY public.sucursal DROP CONSTRAINT sucursal_pkey;
       public         postgres    false    197            u
           2606    16407    usuario usuario_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (id_usuario);
 >   ALTER TABLE ONLY public.usuario DROP CONSTRAINT usuario_pkey;
       public         postgres    false    196            z
           2606    16418    empleado id_sucursal    FK CONSTRAINT     �   ALTER TABLE ONLY public.empleado
    ADD CONSTRAINT id_sucursal FOREIGN KEY (id_sucursal) REFERENCES public.sucursal(id_sucursal);
 >   ALTER TABLE ONLY public.empleado DROP CONSTRAINT id_sucursal;
       public       postgres    false    198    2679    197            �
      x������ � �      �
      x������ � �      �
      x������ � �     