ALTER TABLE IF EXISTS public.pessoa_fisica
    ADD COLUMN tipo_pessoa character varying(255) COLLATE pg_catalog."default";

ALTER TABLE IF EXISTS public.pessoa_juridica
    ADD COLUMN tipo_pessoa character varying(255) COLLATE pg_catalog."default";


