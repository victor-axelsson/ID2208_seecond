-- Table: public.bookings

-- DROP TABLE public.bookings;

CREATE TABLE public.bookings
(
    id bigint NOT NULL,
    "departureId" bigint,
    "cardNumber" character varying(16) COLLATE pg_catalog."default",
    CONSTRAINT bookings_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.bookings
    OWNER to postgres;

INSERT INTO bookings values (1, 2, '0000000000000000');
INSERT INTO bookings values (2, 2, '0000000000000002');
INSERT INTO bookings values (3, 2, '0000000000000001');
