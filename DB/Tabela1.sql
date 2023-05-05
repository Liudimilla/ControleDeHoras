CREATE TABLE `apontamentos` (
  `id_apontamento` bigint NOT NULL,
  `ano` int NOT NULL,
  `dias_trabalhados` int NOT NULL,
  `jornada_de_trabalho` int DEFAULT NULL,
  `mes` int NOT NULL,
  `profissional_id` bigint DEFAULT NULL,
  `projeto_alocado_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id_apontamento`),
  KEY `FKbc89v2an3cwlnedsf3n9ndxkp` (`profissional_id`),
  KEY `FK9n3wwqu682dq1cko2oirq5rn0` (`projeto_alocado_id`),
  CONSTRAINT `FK9n3wwqu682dq1cko2oirq5rn0` FOREIGN KEY (`projeto_alocado_id`) REFERENCES `projeto_alocado` (`id`),
  CONSTRAINT `FKbc89v2an3cwlnedsf3n9ndxkp` FOREIGN KEY (`profissional_id`) REFERENCES `profissional` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- api.profissional definition

CREATE TABLE `profissional` (
  `id` bigint NOT NULL,
  `matricula` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- api.projeto_alocado definition

CREATE TABLE `projeto_alocado` (
  `id` bigint NOT NULL,
  `codigo` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;