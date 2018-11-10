import {Supervisor} from '../../supervisors/supervisor.model';
import {Student} from '../../students/student.model';
import {Project} from '../project.model';
/*
Mock data
 */
export const supervisors: Supervisor[] = [
  new Supervisor('td2345', 'Tom Denison'),
  new Supervisor('go1234', 'Gillian Oliver'),
  new Supervisor('plb123', 'Pierre Le Bodic'),
  new Supervisor('dh4356', 'Daniel Harabor'),
  new Supervisor('je2343', 'Joanne Evans'),
  new Supervisor('gr4567', 'Greg Rolan')
];

export const projects: Project[] = [
  new Project('Digital repositories for Art Archives',
    'How can a living archive be created that not only documents the Monash University Prato Centre (MUPC) Visual Residency Program but also engages artists-in-residence in a direct and active way as part of their residency experience in Prato? In collaboration with Monash University Museum of Art and Monash University Prato Centre, this project aims to help realise the creative possibilities inherent in cross-fertilizing artistic processes with archival theory. It will establish a prototype archival platform that complements contemporary art practices and supports the ability to record, relate and re-vision ephemera and events associated with transformative, creative experience as artefacts themselves.',
    'To develop a prototype digital repository suitable for use by artists participating in the Monash University Prato Artists in Residence Program.',
    'Familiarity with digital repositories and/or open source software and/or archival principles.',
    [18, 24],
    [supervisors[0], supervisors[1]],
    [],
    ['Digital Repositories', 'Open Source']
  ),
  new Project('Approximation algorithms in the Branch-and-Bound algorithm',
    'The Branch-and-Bound algorithm solves optimisation problems by recursively dividing and exploring the space of solutions, using bounds computed on each of them to prune entire subspaces of solutions. The bounds are often computed using a linear program, and the efficiency of the whole procedure depends on the quality of these bounds and the efficiency with which they can be computed.',
    'In this project you will analyse theoretically and experimentally the benefits of using approximation algorithms (i.e. heuristics with a performance guarantee) to compute the bound, compared to a bound computed using linear programming.',
    'A strong background in computational complexity is necessary. Knowledge of integer programming is a plus.',
    [18, 24],
    [supervisors[2]],
    ['https://en.wikipedia.org/wiki/Branch_and_bound',
      'https://en.wikipedia.org/wiki/Approximation_algorithm',
      'http://dx.doi.org/10.1007/978-3-319-11008-0',
      'https://www.cc.gatech.edu/fac/Vijay.Vazirani/book.pdf',
      'http://www.designofapproxalgs.com/book.pdf'],
    ['Algorithms', 'Integer Programming']
  ),
  new Project('Automated Warehouse Optimisation',
    'Warehouses are becoming increasingly automated and optimised. A great example is Amazon fulfilment centres (see https://www.youtube.com/watch?v=tMpsMt7ETi8 ). Many computer science problems, ranging from pathfinding to scheduling and facility layout, need to be solved to design efficient warehouses and their systems. These individual problems are not all well formalised and solved yet, and contributions in these directions are bound to have a high scientific and societal impact.',
    'The aim of this project is to formalise one of the problems related to warehouse automation, design methods to solve the problem, and run experiments to assess their performance.',
    'Strong general background in CS, both in theory and practice, and interest in pathfinding and/or optimisation.',
    [18, 24],
    [supervisors[3], supervisors[2]],
    ['The videos https://www.youtube.com/watch?v=YSrnV0wZywU and https://www.youtube.com/watch?v=lT4X3cuIHK8 provide further background.'],
    []
  ),
  new Project('A Child Protection Recordkeeping App for Parents and Family Members',
    `Within the faculty’s Centre for Organisational and Community Informatics, the Archives and the Rights of the Child Research Program is investigating ways to re-imagine recordkeeping systems in support of responsive and accountable child-centred and family focused out-of-home care. Progressive child protection practice recognises the need, where possible, to support and strengthen parental engagement in the system in order to ensure the best interests of the child.
    '‘No single strategy is of itself effective in protecting children. However, the most important factor contributing to success is the quality of the relationship between the child’s family and the responsible professional’ (Dartington, 1995 quoted in Qld Department of Communities, Child Safety and Disability Services 2013).
    'Child protection and court processes generate a mountain of documentation that can be overwhelming and confusing to navigate, hard to manage and keep track of, especially if parents are also dealing with health and behavioural issues. Being on top of the paperwork handed out by workers, providing the documentation the system demands in a timely fashion and ensuring that records are created to document interactions, etc. could be one way in which child protection outcomes could be improved.`,
    'In this exploratory project, we would like to investigate how digital and networked information technologies could be used to support the recordkeeping needs of parents in child protection cases. It will involve the use of a design science approach to develop a model the information architecture of a recordkeeping system for parents. This may entail the creation of a prototype utilising existing and/or new open source components as a demonstrator for further research and development.\n' +
    '\n' +
    'Challenges include investigating and dealing with the digital, recordkeeping, and other literacies of families involved in child protection.  The other challenge is that there will not be time to form the deep, trusted relationships that are required to do this in a truly participatory manner.  The project will rely on secondary sources such as literature and subject matter experts --- rather than interacting with parents and families directly.',
    'The ideal candidate will have a background in one or more of software development, data analytics, and recordkeeping metadata modelling, with a keen desire to expand their knowledge and skills into the other areas encompassed by this research project. They will have.\n' +
    '\n' +
    'This is not so much a technical projects as one that engages with the societal and community needs of the target audience. It would suit someone from an MBIS background with an interest in community informatics, recordkeeping metadata modelling and/or value sensitive research and design, coupled with a keen desire to expand their existing knowledge and skills into the other areas encompassed but this research project.',
    [24],
    [supervisors[4], supervisors[5]],
    ['Assistant Director Child Protection. (2017). Child Protection Manual. Retrieved February 8, 2018, from http://www.cpmanual.vic.gov.au/',
      'Burstein, F. (2002). System development in information systems research. In K. Williamson (Ed.), Research Methods for Students and Professionals: Information Management and Systems (pp. 147–158). Wagga Wagga, N.S.W.: Centre for Information Studies, Charles Sturt University.\n',
      'Gurstein, M. (2003). Effective use: A community informatics strategy beyond the Digital Divide. First Monday, 8(12). Retrieved from http://firstmonday.org/ojs/index.php/fm/article/view/1107',
      'Hinton, T. (2013). Parents in the child protection system. Social Action and Research Centre, Anglicare Tasmania. Retrieved from https://www.socialactionresearchcentre.org.au/wp-content/uploads/Parents-in-the-child-protection-system.pdf\n',
      'Hersberger, J. A. (2013). Are the economically poor information poor? Does the digital divide affect the homeless and access to information? Presented at the Proceedings of the Annual Conference of CAIS/Actes du congrès annuel de l’ACSI.',
      'Western Suburbs Legal Service. (2008). Child protection : a guide for parents and family members. Newport, Vic.: Western Suburbs Legal Service.'],
    [])
];


export const students: Student[] = [
  new Student('27738965', 'mmah65', [projects[0], projects[1]]),
  new Student('24376122', 'lyon23', [projects[1], projects[2]]),
  new Student('12315451', 'jlim43', [projects[2], projects[3]])
];

