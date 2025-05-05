package fossils.fossils.client.blockentity.model.dimorphodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DimorphodonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart chest;
	private final ModelPart leftWing;
	private final ModelPart leftWing2;
	private final ModelPart leftWing3;
	private final ModelPart hand;
	private final ModelPart leftWing4;
	private final ModelPart leftWing5;
	private final ModelPart leftWing6;
	private final ModelPart rightWing;
	private final ModelPart rightWing2;
	private final ModelPart rightWing3;
	private final ModelPart hand2;
	private final ModelPart rightWing4;
	private final ModelPart rightWing5;
	private final ModelPart rightWing6;
	private final ModelPart body1;
	private final ModelPart leftLeg;
	private final ModelPart leftLegMembrane;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart finger;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLegMembrane;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart finger2;
	private final ModelPart rightLeg4;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart head2;
	private final ModelPart jaw;

	public DimorphodonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.chest = this.root.getChild("chest");
		this.leftWing = this.chest.getChild("leftWing");
		this.leftWing2 = this.leftWing.getChild("leftWing2");
		this.leftWing3 = this.leftWing2.getChild("leftWing3");
		this.hand = this.leftWing3.getChild("hand");
		this.leftWing4 = this.leftWing3.getChild("leftWing4");
		this.leftWing5 = this.leftWing4.getChild("leftWing5");
		this.leftWing6 = this.leftWing5.getChild("leftWing6");
		this.rightWing = this.chest.getChild("rightWing");
		this.rightWing2 = this.rightWing.getChild("rightWing2");
		this.rightWing3 = this.rightWing2.getChild("rightWing3");
		this.hand2 = this.rightWing3.getChild("hand2");
		this.rightWing4 = this.rightWing3.getChild("rightWing4");
		this.rightWing5 = this.rightWing4.getChild("rightWing5");
		this.rightWing6 = this.rightWing5.getChild("rightWing6");
		this.body1 = this.chest.getChild("body1");
		this.leftLeg = this.body1.getChild("leftLeg");
		this.leftLegMembrane = this.leftLeg.getChild("leftLegMembrane");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.finger = this.leftLeg3.getChild("finger");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.body1.getChild("rightLeg");
		this.rightLegMembrane = this.rightLeg.getChild("rightLegMembrane");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.finger2 = this.rightLeg3.getChild("finger2");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.tail1 = this.body1.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.head2 = this.head.getChild("head2");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest = root.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.5867F, -5.8742F, -0.0436F, 0.0F, 0.0F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(61, 6).addBox(-0.8F, -1.0768F, 1.8922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(54, 60).addBox(-0.8F, -0.9768F, -0.1078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(32, 30).addBox(-0.5F, -0.5768F, -0.1078F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, 0.3926F, -2.7013F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(38, 15).mirror().addBox(-0.5846F, -0.6346F, -2.4169F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3176F, 1.1734F, -0.1999F, 0.4275F, -0.0564F, -0.0527F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(24, 60).mirror().addBox(-0.5953F, -0.5F, -0.2249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6348F, 3.5965F, 0.7901F, -0.1466F, 0.4863F, 0.2009F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(29, 60).mirror().addBox(-0.6417F, -0.5F, -0.7961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6348F, 3.5965F, 0.7901F, -0.1404F, -0.2006F, 0.3012F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 27).mirror().addBox(1.0394F, 5.8526F, -2.2444F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.4183F, 3.1294F, -0.1443F, 0.4323F, 0.201F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(25, 46).mirror().addBox(0.7855F, 5.8526F, -2.2974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.4183F, 3.1294F, -0.1309F, 0.0F, 0.2618F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(28, 55).mirror().addBox(-0.2979F, -0.5924F, -0.6266F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5964F, 2.7411F, -1.0204F, 1.0583F, 1.0842F, -0.1343F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(14, 58).mirror().addBox(-0.4956F, -1.8877F, -0.6028F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5964F, 2.7411F, -1.2204F, 0.9271F, 0.8378F, 0.227F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(38, 10).mirror().addBox(-0.5846F, -0.7214F, -2.4323F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3176F, 1.1734F, -0.1999F, 0.2356F, -0.0564F, -0.0527F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(46, 45).mirror().addBox(-0.588F, -0.782F, -0.0308F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3176F, 1.1734F, -0.1999F, -0.0329F, 0.13F, -0.0734F));

		PartDefinition chest_r2 = chest.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-2.6824F, -1.2346F, -0.5033F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.1415F, -0.2961F, 0.0756F, 0.167F, -1.3051F));

		PartDefinition chest_r3 = chest.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(44, 60).mirror().addBox(-1.4844F, -0.4459F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.1415F, -0.2961F, 0.1652F, 0.0795F, -0.6067F));

		PartDefinition chest_r4 = chest.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(49, 60).mirror().addBox(-0.85F, -0.1506F, -0.5214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.1415F, -0.2961F, 0.1889F, 0.0283F, -0.1727F));

		PartDefinition chest_r5 = chest.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(60, 42).mirror().addBox(-2.3824F, -1.2346F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(60, 39).mirror().addBox(-1.6824F, -1.2346F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.2415F, -2.2961F, 0.1056F, 0.2946F, -1.3419F));

		PartDefinition chest_r6 = chest.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(39, 60).mirror().addBox(-1.4844F, -0.4459F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.2415F, -2.2961F, 0.2705F, 0.1582F, -0.6378F));

		PartDefinition chest_r7 = chest.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(34, 60).mirror().addBox(-0.85F, -0.1507F, -0.5214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.2415F, -2.2961F, 0.317F, 0.056F, -0.211F));

		PartDefinition chest_r8 = chest.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(49, 60).addBox(-0.15F, -0.1506F, -0.5214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.1415F, -0.2961F, 0.1889F, -0.0283F, 0.1727F));

		PartDefinition chest_r9 = chest.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(44, 60).addBox(0.4844F, -0.4459F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.1415F, -0.2961F, 0.1652F, -0.0795F, 0.6067F));

		PartDefinition chest_r10 = chest.addOrReplaceChild("chest_r10", CubeListBuilder.create().texOffs(0, 56).addBox(0.6824F, -1.2346F, -0.5033F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.1415F, -0.2961F, 0.0756F, -0.167F, 1.3051F));

		PartDefinition chest_r11 = chest.addOrReplaceChild("chest_r11", CubeListBuilder.create().texOffs(60, 42).addBox(1.3824F, -1.2346F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(60, 39).addBox(0.6824F, -1.2346F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.2415F, -2.2961F, 0.1056F, -0.2946F, 1.3419F));

		PartDefinition chest_r12 = chest.addOrReplaceChild("chest_r12", CubeListBuilder.create().texOffs(39, 60).addBox(0.4844F, -0.4459F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.2415F, -2.2961F, 0.2705F, -0.1582F, 0.6378F));

		PartDefinition chest_r13 = chest.addOrReplaceChild("chest_r13", CubeListBuilder.create().texOffs(34, 60).addBox(-0.15F, -0.1507F, -0.5214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.2415F, -2.2961F, 0.317F, -0.056F, 0.211F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(46, 45).addBox(-0.412F, -0.782F, -0.0308F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3176F, 1.1734F, -0.1999F, -0.0329F, -0.13F, 0.0734F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(38, 15).addBox(-0.4154F, -0.6346F, -2.4169F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3176F, 1.1734F, -0.1999F, 0.4275F, 0.0564F, 0.0527F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(38, 10).addBox(-0.4154F, -0.7214F, -2.4323F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3176F, 1.1734F, -0.1999F, 0.2356F, 0.0564F, 0.0527F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(14, 58).addBox(-0.5044F, -1.8877F, -0.6028F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5964F, 2.7411F, -1.2204F, 0.9271F, -0.8378F, -0.227F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(28, 55).addBox(-0.7021F, -0.5924F, -0.6266F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5964F, 2.7411F, -1.0204F, 1.0583F, -1.0842F, 0.1343F));

		PartDefinition cube_r15 = chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(10, 59).addBox(0.5F, -0.1036F, -1.8826F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 43).addBox(0.496F, -0.1036F, -0.9826F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.8817F, -0.3706F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r16 = chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(25, 46).addBox(-1.7855F, 5.8526F, -2.2974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -2.4183F, 3.1294F, -0.1309F, 0.0F, -0.2618F));

		PartDefinition cube_r17 = chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(36, 27).addBox(-3.0394F, 5.8526F, -2.2444F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -2.4183F, 3.1294F, -0.1443F, -0.4323F, -0.201F));

		PartDefinition cube_r18 = chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(29, 60).addBox(-0.3583F, -0.5F, -0.7961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6348F, 3.5965F, 0.7901F, -0.1404F, 0.2006F, -0.3012F));

		PartDefinition cube_r19 = chest.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(24, 60).addBox(-0.4047F, -0.5F, -0.2249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6348F, 3.5965F, 0.7901F, -0.1466F, -0.4863F, -0.2009F));

		PartDefinition cube_r20 = chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(18, 46).addBox(-0.5F, 6.6805F, -2.1884F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(59, 59).addBox(-0.5F, 6.6805F, -3.1884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.0183F, 3.1294F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftWing = chest.addOrReplaceChild("leftWing", CubeListBuilder.create().texOffs(19, 58).addBox(-0.5F, 0.85F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 41).addBox(-0.5F, -0.15F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.535F, 1.3675F, -2.0572F, 0.5621F, 0.2936F, -0.5626F));

		PartDefinition cube_r21 = leftWing.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(58, 47).addBox(-0.5F, -0.8F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.65F, 0.3F, -0.1571F, 0.0F, 0.0F));

		PartDefinition leftWing2 = leftWing.addOrReplaceChild("leftWing2", CubeListBuilder.create().texOffs(22, 37).addBox(-0.7001F, -0.1808F, -0.0248F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(27, 37).addBox(-0.7001F, -0.1808F, -0.8248F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2256F, 4.7892F, -0.6746F, -1.2936F, 0.3527F, -0.0295F));

		PartDefinition cube_r22 = leftWing2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(58, 51).addBox(-0.5F, -2.4F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2001F, 7.9458F, -1.1264F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leftWing3 = leftWing2.addOrReplaceChild("leftWing3", CubeListBuilder.create().texOffs(33, 55).addBox(-0.9656F, -0.1774F, -0.3857F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1672F, 7.0884F, -0.2605F, 0.5638F, -0.0858F, 0.1388F));

		PartDefinition hand = leftWing3.addOrReplaceChild("hand", CubeListBuilder.create().texOffs(43, 31).addBox(-0.6299F, -1.8109F, 0.1631F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5681F, 2.6135F, -0.4817F, -0.0795F, 0.0815F, 1.7288F));

		PartDefinition leftWing4 = leftWing3.addOrReplaceChild("leftWing4", CubeListBuilder.create().texOffs(0, 11).addBox(-0.9075F, -0.4566F, -0.2098F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0206F, 3.0541F, 0.0324F, 0.8469F, -0.2276F, -0.0541F));

		PartDefinition cube_r23 = leftWing4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(36, 21).addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.4075F, 0.4434F, 7.6902F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftWing5 = leftWing4.addOrReplaceChild("leftWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1957F, -0.4806F, 10.9029F, -0.0047F, -0.2075F, -0.0505F));

		PartDefinition cube_r24 = leftWing5.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.9F, -3.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2111F, -0.2093F, 2.9013F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leftWing6 = leftWing5.addOrReplaceChild("leftWing6", CubeListBuilder.create().texOffs(19, 11).addBox(-0.5073F, -0.6863F, -0.2623F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1962F, -1.7041F, 8.5825F, 0.3486F, -0.1455F, -0.0965F));

		PartDefinition rightWing = chest.addOrReplaceChild("rightWing", CubeListBuilder.create().texOffs(19, 58).mirror().addBox(-0.5F, 0.85F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 41).mirror().addBox(-0.5F, -0.15F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.535F, 1.3675F, -2.0572F, 1.1966F, -0.3432F, 0.487F));

		PartDefinition cube_r25 = rightWing.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(58, 47).mirror().addBox(-0.5F, -0.8F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.65F, 0.3F, -0.1571F, 0.0F, 0.0F));

		PartDefinition rightWing2 = rightWing.addOrReplaceChild("rightWing2", CubeListBuilder.create().texOffs(22, 37).mirror().addBox(-0.2999F, -0.1808F, -0.0248F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(27, 37).mirror().addBox(-0.2999F, -0.1808F, -0.8248F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2256F, 4.7892F, -0.6746F, -1.2936F, -0.3527F, 0.0295F));

		PartDefinition cube_r26 = rightWing2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(58, 51).mirror().addBox(-0.5F, -2.4F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2001F, 7.9458F, -1.1264F, 0.4363F, 0.0F, 0.0F));

		PartDefinition rightWing3 = rightWing2.addOrReplaceChild("rightWing3", CubeListBuilder.create().texOffs(33, 55).mirror().addBox(-0.0344F, -0.1774F, -0.3857F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1672F, 7.0884F, -0.2605F, 0.5638F, 0.0858F, -0.1388F));

		PartDefinition hand2 = rightWing3.addOrReplaceChild("hand2", CubeListBuilder.create().texOffs(43, 31).mirror().addBox(-0.3701F, -1.8109F, 0.1631F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.5681F, 2.6135F, -0.4817F, -0.0795F, -0.0815F, -1.7288F));

		PartDefinition rightWing4 = rightWing3.addOrReplaceChild("rightWing4", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-0.0925F, -0.4566F, -0.2098F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0206F, 3.0541F, 0.0324F, 0.8469F, 0.2276F, 0.0541F));

		PartDefinition cube_r27 = rightWing4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(36, 21).mirror().addBox(-0.5F, -0.9F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.4075F, 0.4434F, 7.6902F, 0.1571F, 0.0F, 0.0F));

		PartDefinition rightWing5 = rightWing4.addOrReplaceChild("rightWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1957F, -0.4806F, 10.9029F, -0.0047F, 0.2075F, 0.0505F));

		PartDefinition cube_r28 = rightWing5.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -0.9F, -3.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2111F, -0.2093F, 2.9013F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightWing6 = rightWing5.addOrReplaceChild("rightWing6", CubeListBuilder.create().texOffs(19, 11).mirror().addBox(-0.4927F, -0.6863F, -0.2623F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1962F, -1.7041F, 8.5825F, 0.3486F, 0.1455F, 0.0965F));

		PartDefinition body1 = chest.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.257F, 1.2053F, -0.1309F, 0.0F, 0.0F));

		PartDefinition body3_r1 = body1.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(64, 57).addBox(-0.8F, -0.689F, 0.8574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 63).mirror().addBox(-1.2F, -0.014F, 0.8574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(5, 63).addBox(0.2F, -0.014F, 0.8574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(40, 5).addBox(-0.5F, -0.314F, -0.1426F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4345F, 4.1685F, -0.24F, 0.0F, 0.0F));

		PartDefinition chest_r14 = body1.addOrReplaceChild("chest_r14", CubeListBuilder.create().texOffs(15, 62).mirror().addBox(-0.85F, -0.1507F, -0.5214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.4984F, 3.7986F, -0.0689F, -0.0172F, -0.1742F));

		PartDefinition chest_r15 = body1.addOrReplaceChild("chest_r15", CubeListBuilder.create().texOffs(59, 62).mirror().addBox(-1.4844F, -0.4459F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.4984F, 3.7986F, -0.0496F, -0.0704F, -0.6077F));

		PartDefinition chest_r16 = body1.addOrReplaceChild("chest_r16", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-1.6824F, -1.2346F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.4984F, 3.7986F, 0.0073F, -0.0858F, -1.3079F));

		PartDefinition cube_r29 = body1.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(30, 63).mirror().addBox(-2.9373F, 0.0496F, -7.5226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false)
				.texOffs(25, 63).mirror().addBox(-2.6623F, 0.0496F, -7.5226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false)
				.texOffs(20, 63).mirror().addBox(-2.6623F, 0.0496F, -7.2476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -3.1719F, 7.7338F, -0.4036F, 0.6475F, -1.9337F));

		PartDefinition cube_r30 = body1.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(63, 45).mirror().addBox(-0.5081F, -0.1474F, -0.6419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(63, 48).mirror().addBox(-0.5081F, -0.7474F, -0.4419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(45, 63).mirror().addBox(-0.5081F, -0.1474F, -0.4419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1244F, 1.6283F, 5.8785F, 0.2182F, 0.2182F, 0.0F));

		PartDefinition cube_r31 = body1.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(63, 51).mirror().addBox(-0.4215F, -0.7949F, -0.2457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.1244F, 2.5283F, 6.2785F, 0.8988F, 0.2182F, 0.0F));

		PartDefinition cube_r32 = body1.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(57, 30).mirror().addBox(-0.1707F, 5.0423F, -5.0639F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.0219F, 7.7338F, 0.1321F, 0.3029F, 0.0396F));

		PartDefinition cube_r33 = body1.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(47, 10).mirror().addBox(-0.5907F, 3.3954F, -6.9539F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.139F, -3.1687F, 8.4261F, 0.4053F, 0.1346F, -0.1008F));

		PartDefinition cube_r34 = body1.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(35, 63).mirror().addBox(-0.5081F, 0.0393F, -0.1985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.1244F, 1.6283F, 5.8785F, 0.6981F, 0.2182F, 0.0F));

		PartDefinition cube_r35 = body1.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(40, 63).mirror().addBox(-0.5081F, 0.2526F, -1.0669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.1244F, 1.6283F, 5.8785F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r36 = body1.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-0.5081F, -0.7474F, -0.9669F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.1244F, 1.6283F, 5.8785F, -0.1309F, 0.2182F, 0.0F));

		PartDefinition cube_r37 = body1.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(50, 63).mirror().addBox(-0.546F, -0.7561F, -0.2768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.1244F, 2.6283F, 5.7035F, 0.2443F, 0.2182F, 0.0F));

		PartDefinition cube_r38 = body1.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(64, 24).mirror().addBox(-0.7405F, 5.9753F, 0.5554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(64, 36).mirror().addBox(-0.7405F, 5.9753F, 1.0554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -5.5673F, 7.0009F, -0.5995F, 0.2106F, -0.0573F));

		PartDefinition cube_r39 = body1.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(64, 27).mirror().addBox(-0.3377F, 6.3295F, -2.8059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -5.4673F, 8.9009F, -0.1457F, 0.2106F, -0.0573F));

		PartDefinition cube_r40 = body1.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(64, 30).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.9714F, 0.8735F, 6.4768F, -0.1097F, 0.2154F, 0.0347F));

		PartDefinition cube_r41 = body1.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(64, 33).mirror().addBox(0.5263F, 4.1936F, -5.7525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0332F, -5.022F, 10.0615F, 0.283F, 0.2154F, 0.0347F));

		PartDefinition cube_r42 = body1.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(64, 54).mirror().addBox(-0.3377F, 6.6596F, -2.1236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -5.4673F, 8.9009F, -0.3202F, 0.2106F, -0.0573F));

		PartDefinition chest_r17 = body1.addOrReplaceChild("chest_r17", CubeListBuilder.create().texOffs(61, 21).mirror().addBox(-0.85F, -0.1506F, -0.5214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.3984F, 2.0986F, 0.1029F, 0.0132F, -0.1745F));

		PartDefinition chest_r18 = body1.addOrReplaceChild("chest_r18", CubeListBuilder.create().texOffs(10, 62).mirror().addBox(-1.4844F, -0.4459F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.3984F, 2.0986F, 0.0935F, 0.0296F, -0.6106F));

		PartDefinition chest_r19 = body1.addOrReplaceChild("chest_r19", CubeListBuilder.create().texOffs(56, 3).mirror().addBox(-2.6824F, -1.2346F, -0.5033F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.3984F, 2.0986F, 0.0526F, 0.0827F, -1.308F));

		PartDefinition chest_r20 = body1.addOrReplaceChild("chest_r20", CubeListBuilder.create().texOffs(61, 12).mirror().addBox(-3.3824F, -1.2346F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(56, 0).mirror().addBox(-2.6824F, -1.2346F, -0.5033F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.3984F, 0.2986F, 0.064F, 0.1249F, -1.3068F));

		PartDefinition chest_r21 = body1.addOrReplaceChild("chest_r21", CubeListBuilder.create().texOffs(61, 15).mirror().addBox(-1.4844F, -0.4459F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.3984F, 0.2986F, 0.1293F, 0.0546F, -0.6091F));

		PartDefinition chest_r22 = body1.addOrReplaceChild("chest_r22", CubeListBuilder.create().texOffs(61, 18).mirror().addBox(-0.85F, -0.1506F, -0.5214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.3984F, 0.2986F, 0.1459F, 0.0207F, -0.1738F));

		PartDefinition cube_r43 = body1.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(64, 54).addBox(-0.6623F, 6.6596F, -2.1236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.0F, -5.4673F, 8.9009F, -0.3202F, -0.2106F, 0.0573F));

		PartDefinition cube_r44 = body1.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(64, 36).addBox(-0.2595F, 5.9753F, 1.0554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(64, 24).addBox(-0.2595F, 5.9753F, 0.5554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, -5.5673F, 7.0009F, -0.5995F, -0.2106F, 0.0573F));

		PartDefinition cube_r45 = body1.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(64, 33).addBox(-1.5263F, 4.1936F, -5.7525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0332F, -5.022F, 10.0615F, 0.283F, -0.2154F, -0.0347F));

		PartDefinition cube_r46 = body1.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(64, 30).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.9714F, 0.8735F, 6.4768F, -0.1097F, -0.2154F, -0.0347F));

		PartDefinition cube_r47 = body1.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(64, 27).addBox(-0.6623F, 6.3295F, -2.8059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.0F, -5.4673F, 8.9009F, -0.1457F, -0.2106F, 0.0573F));

		PartDefinition cube_r48 = body1.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(63, 51).addBox(-0.5785F, -0.7949F, -0.2457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.1244F, 2.5283F, 6.2785F, 0.8988F, -0.2182F, 0.0F));

		PartDefinition cube_r49 = body1.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(50, 63).addBox(-0.454F, -0.7561F, -0.2768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.1244F, 2.6283F, 5.7035F, 0.2443F, -0.2182F, 0.0F));

		PartDefinition cube_r50 = body1.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(63, 48).addBox(-0.4919F, -0.7474F, -0.4419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(63, 45).addBox(-0.4919F, -0.1474F, -0.6419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(45, 63).addBox(-0.4919F, -0.1474F, -0.4419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1244F, 1.6283F, 5.8785F, 0.2182F, -0.2182F, 0.0F));

		PartDefinition cube_r51 = body1.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 59).addBox(-0.4919F, -0.7474F, -0.9669F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.1244F, 1.6283F, 5.8785F, -0.1309F, -0.2182F, 0.0F));

		PartDefinition cube_r52 = body1.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(40, 63).addBox(-0.4919F, 0.2526F, -1.0669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.1244F, 1.6283F, 5.8785F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r53 = body1.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(35, 63).addBox(-0.4919F, 0.0393F, -0.1985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.1244F, 1.6283F, 5.8785F, 0.6981F, -0.2182F, 0.0F));

		PartDefinition cube_r54 = body1.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(47, 10).addBox(-0.4093F, 3.3954F, -6.9539F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.139F, -3.1687F, 8.4261F, 0.4053F, -0.1346F, 0.1008F));

		PartDefinition cube_r55 = body1.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(57, 30).addBox(-1.8293F, 5.0423F, -5.0639F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)), PartPose.offsetAndRotation(0.0F, -3.0219F, 7.7338F, 0.1321F, -0.3029F, -0.0396F));

		PartDefinition cube_r56 = body1.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(30, 63).addBox(1.9373F, 0.0496F, -7.5226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F))
				.texOffs(25, 63).addBox(1.6623F, 0.0496F, -7.5226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F))
				.texOffs(20, 63).addBox(1.6623F, 0.0496F, -7.2476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.356F)), PartPose.offsetAndRotation(1.2F, -3.1719F, 7.7338F, -0.4036F, -0.6475F, 1.9337F));

		PartDefinition body3_r2 = body1.addOrReplaceChild("body3_r2", CubeListBuilder.create().texOffs(63, 3).addBox(-0.8F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2655F, 3.8428F, -0.192F, 0.0F, 0.0F));

		PartDefinition body2_r1 = body1.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(9, 47).addBox(-0.5F, -0.2108F, -0.1445F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, 0.1345F, 2.4935F, -0.1047F, 0.0F, 0.0F));

		PartDefinition body3_r3 = body1.addOrReplaceChild("body3_r3", CubeListBuilder.create().texOffs(63, 0).addBox(-0.8F, -0.9579F, 1.8499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(61, 9).addBox(-0.8F, -0.9579F, -0.1501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(40, 0).addBox(-0.5F, -0.5579F, -0.1501F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4345F, -0.2065F, -0.0175F, 0.0F, 0.0F));

		PartDefinition chest_r23 = body1.addOrReplaceChild("chest_r23", CubeListBuilder.create().texOffs(0, 63).addBox(0.6824F, -1.2346F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.4984F, 3.7986F, 0.0073F, 0.0858F, 1.3079F));

		PartDefinition chest_r24 = body1.addOrReplaceChild("chest_r24", CubeListBuilder.create().texOffs(59, 62).addBox(0.4844F, -0.4459F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.4984F, 3.7986F, -0.0496F, 0.0704F, 0.6077F));

		PartDefinition chest_r25 = body1.addOrReplaceChild("chest_r25", CubeListBuilder.create().texOffs(15, 62).addBox(-0.15F, -0.1507F, -0.5214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.4984F, 3.7986F, -0.0689F, 0.0172F, 0.1742F));

		PartDefinition chest_r26 = body1.addOrReplaceChild("chest_r26", CubeListBuilder.create().texOffs(56, 3).addBox(0.6824F, -1.2346F, -0.5033F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.3984F, 2.0986F, 0.0526F, -0.0827F, 1.308F));

		PartDefinition chest_r27 = body1.addOrReplaceChild("chest_r27", CubeListBuilder.create().texOffs(10, 62).addBox(0.4844F, -0.4459F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.3984F, 2.0986F, 0.0935F, -0.0296F, 0.6106F));

		PartDefinition chest_r28 = body1.addOrReplaceChild("chest_r28", CubeListBuilder.create().texOffs(61, 21).addBox(-0.15F, -0.1506F, -0.5214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.3984F, 2.0986F, 0.1029F, -0.0132F, 0.1745F));

		PartDefinition chest_r29 = body1.addOrReplaceChild("chest_r29", CubeListBuilder.create().texOffs(61, 18).addBox(-0.15F, -0.1506F, -0.5214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.3984F, 0.2986F, 0.1459F, -0.0207F, 0.1738F));

		PartDefinition chest_r30 = body1.addOrReplaceChild("chest_r30", CubeListBuilder.create().texOffs(61, 15).addBox(0.4844F, -0.4459F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.3984F, 0.2986F, 0.1293F, -0.0546F, 0.6091F));

		PartDefinition chest_r31 = body1.addOrReplaceChild("chest_r31", CubeListBuilder.create().texOffs(61, 12).addBox(2.3824F, -1.2346F, -0.5033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(56, 0).addBox(0.6824F, -1.2346F, -0.5033F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, 0.3984F, 0.2986F, 0.064F, -0.1249F, 1.3068F));

		PartDefinition leftLeg = body1.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(13, 31).addBox(-0.4F, 0.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4809F, 2.3972F, 5.9239F, 0.7607F, 0.2989F, -0.2424F));

		PartDefinition leftLegMembrane = leftLeg.addOrReplaceChild("leftLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(32, 42).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2454F, 4.6412F, -0.1333F, 0.9317F, -0.0413F, 0.3525F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(0, 31).addBox(-1.0F, 0.0F, -3.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5249F, 6.6885F, 0.5404F, 0.6364F, 0.0984F, -0.0101F));

		PartDefinition finger = leftLeg3.addOrReplaceChild("finger", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.3F, 0.0623F, -0.0982F, -0.0319F));

		PartDefinition cube_r57 = finger.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(47, 22).addBox(-0.5589F, -0.5F, -1.6422F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9F, 0.0F, -2.2F, 0.0F, 1.0559F, 0.0F));

		PartDefinition cube_r58 = finger.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(47, 18).addBox(-0.4983F, -0.5F, -1.5238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3F, 0.0F, -1.2F, 0.0F, 0.6021F, 0.0F));

		PartDefinition cube_r59 = finger.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(47, 14).addBox(-0.3039F, -0.5F, -1.7478F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, 0.0F, 0.3491F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(9, 43).addBox(-1.0F, -0.0101F, -1.9001F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0133F, -3.6149F, 0.437F, 0.0F, 0.0F));

		PartDefinition rightLeg = body1.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(13, 31).mirror().addBox(-0.6F, 0.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4809F, 2.3972F, 5.9239F, 0.3219F, 0.26F, 0.4185F));

		PartDefinition rightLegMembrane = rightLeg.addOrReplaceChild("rightLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 1.6F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(32, 42).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2454F, 4.6412F, -0.1333F, 0.9107F, -0.2377F, -0.141F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-1.0F, 0.0F, -3.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5249F, 6.6885F, 0.5404F, -0.3671F, -0.0984F, 0.0101F));

		PartDefinition finger2 = rightLeg3.addOrReplaceChild("finger2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.5F, 0.3F, 0.0623F, 0.0982F, 0.0319F));

		PartDefinition cube_r60 = finger2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(47, 22).mirror().addBox(-0.4411F, -0.5F, -1.6422F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.9F, 0.0F, -2.2F, 0.0F, -1.0559F, 0.0F));

		PartDefinition cube_r61 = finger2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(47, 18).mirror().addBox(-0.5017F, -0.5F, -1.5238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.0F, -1.2F, 0.0F, -0.6021F, 0.0F));

		PartDefinition cube_r62 = finger2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(47, 14).mirror().addBox(-0.6961F, -0.5F, -1.7478F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, 0.0F, -0.3491F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(9, 43).mirror().addBox(-1.0F, -0.0101F, -1.9001F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.038F, 0.0046F, -3.2568F, -0.6059F, -0.0809F, -0.1029F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0959F, 6.8659F, -0.162F, -0.0861F, 0.0141F));

		PartDefinition tail3_r1 = tail1.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(64, 63).addBox(-0.8F, -0.3F, 1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(64, 60).addBox(-0.8F, -0.4F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(32, 36).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, -0.2385F, -0.1827F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1598F, 3.5183F, 0.1628F, -0.1292F, -0.0212F));

		PartDefinition tail2_r1 = tail2.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(19, 30).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2695F, -0.1004F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(19, 21).addBox(-0.5F, -0.5144F, -0.1493F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, -0.0039F, 4.5289F, 0.2991F, -0.1251F, -0.0385F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, -0.4634F, -0.2978F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.0867F, 6.6836F, -0.0113F, -0.1733F, -0.0207F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(21, 0).addBox(-0.5F, -0.446F, -0.1976F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0F, -0.0203F, 7.4456F, -0.143F, 0.216F, -0.0308F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1085F, -2.5437F, 0.0968F, -0.1303F, -0.0126F));

		PartDefinition cube_r63 = neck1.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(15, 65).addBox(0.0F, -0.15F, 2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.5F, -2.7599F, -3.8094F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r64 = neck1.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(10, 65).addBox(-0.3F, -0.4077F, -0.0544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(37, 47).addBox(0.0F, -0.1077F, -0.0544F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.9599F, -1.5094F, -0.4538F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(37, 42).addBox(-0.5F, -0.4643F, -2.8064F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(65, 39).addBox(-0.8F, -0.8643F, -2.8064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(65, 42).addBox(-0.8F, -0.7643F, -0.8064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9961F, -2.1112F, -0.8102F, -0.1095F, 0.0891F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1607F, -3.2564F, 0.8309F, 0.0589F, 0.0644F));

		PartDefinition cube_r65 = head.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(43, 27).addBox(-1.0F, -1.0456F, -0.9831F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 2.0723F, -0.8268F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r66 = head.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(52, 57).addBox(-1.0F, -1.0253F, -0.8078F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 2.0723F, -0.0518F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r67 = head.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(45, 57).addBox(-1.0F, -0.9732F, -0.9662F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 2.3973F, 0.5232F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r68 = head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(5, 59).mirror().addBox(0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 59).addBox(1.94F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.72F, 0.6884F, 0.0612F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r69 = head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(66, 12).mirror().addBox(-0.5F, -0.781F, -0.1507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(66, 15).mirror().addBox(-0.5F, -0.781F, 0.1493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(66, 15).addBox(0.99F, -0.781F, 0.1493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(66, 12).addBox(0.99F, -0.781F, -0.1507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.745F, 0.326F, -0.3252F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r70 = head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(44, 49).mirror().addBox(-0.5F, -0.9411F, 0.3247F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(44, 49).addBox(0.99F, -0.9411F, 0.3247F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.745F, 1.326F, -0.7252F, 1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r71 = head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(66, 9).mirror().addBox(-0.5F, -0.1844F, -0.8362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(66, 9).addBox(0.99F, -0.1844F, -0.8362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.745F, -0.374F, -2.2252F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r72 = head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(49, 0).mirror().addBox(-0.5F, -0.1786F, -1.828F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(49, 0).addBox(0.99F, -0.1786F, -1.828F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.745F, 0.226F, -2.1252F, 2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r73 = head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(49, 4).mirror().addBox(-0.5F, -0.8411F, -0.6753F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(49, 4).addBox(0.99F, -0.8411F, -0.6753F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.745F, 1.326F, -0.7252F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r74 = head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(66, 21).mirror().addBox(-0.5F, -0.2062F, -0.2041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(66, 21).addBox(0.99F, -0.2062F, -0.2041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.745F, -1.024F, -0.3752F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(20, 66).mirror().addBox(-0.5F, -0.2234F, -0.1719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(20, 66).addBox(0.99F, -0.2234F, -0.1719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.745F, -1.224F, -0.9752F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(66, 18).mirror().addBox(-0.5F, -0.1973F, -0.1725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(66, 18).addBox(0.99F, -0.1973F, -0.1725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.745F, -1.224F, -1.5752F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(5, 66).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 66).addBox(0.99F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.745F, -0.874F, -1.7002F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(66, 6).mirror().addBox(-0.5F, -0.2653F, -0.7452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(66, 6).addBox(0.99F, -0.2653F, -0.7452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.745F, -0.874F, -2.1002F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(30, 66).mirror().addBox(-0.685F, 6.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(25, 66).mirror().addBox(-0.41F, 6.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(30, 66).addBox(0.775F, 6.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 66).addBox(0.5F, 6.1F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.545F, -6.8033F, -1.1584F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 66).addBox(0.0F, -0.0532F, -1.017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -1.1277F, 1.0368F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, -3.0447F, -1.9234F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.4723F, 0.4868F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 48).addBox(-1.0F, -0.0311F, -0.0095F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.2364F, -2.8257F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(38, 57).addBox(-1.0F, 0.0205F, -0.9965F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4364F, -2.0257F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(43, 36).addBox(-1.0F, -0.0144F, -0.9959F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.4364F, -1.0257F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(57, 36).addBox(-1.0F, -0.0496F, 0.0084F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -1.1364F, -0.0757F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(57, 33).addBox(-1.0F, -0.0335F, -0.6757F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2364F, -0.3757F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(55, 65).addBox(0.0F, 0.0009F, -1.0637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5614F, 0.1743F, 0.48F, 0.0F, 0.0F));

		PartDefinition head2 = head.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -4.75F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r88 = head2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(71, 6).addBox(-0.5F, -0.3133F, -0.7699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -1.925F, -3.0F, 0.5367F, 0.0F, 0.0F));

		PartDefinition cube_r89 = head2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(53, 39).addBox(-0.5F, -0.3133F, -0.2949F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.0F, -1.925F, -3.0F, 0.3622F, 0.0F, 0.0F));

		PartDefinition cube_r90 = head2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(70, 69).addBox(-0.5F, -0.2868F, -0.7269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -2.975F, 2.525F, -0.144F, 0.0F, 0.0F));

		PartDefinition cube_r91 = head2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(70, 66).addBox(-0.5F, -0.2807F, -0.746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(0.0F, -3.05F, 2.05F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r92 = head2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(70, 42).addBox(-0.5F, -0.2449F, 0.078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F))
				.texOffs(65, 69).addBox(-0.5F, -0.2449F, -0.247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.256F))
				.texOffs(69, 63).mirror().addBox(-0.8F, -0.2449F, 0.078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(69, 60).mirror().addBox(-0.8F, -0.2449F, -0.222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(69, 63).addBox(-0.2F, -0.2449F, 0.078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(69, 60).addBox(-0.2F, -0.2449F, -0.222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.0F, -2.95F, 0.25F, 0.1527F, 0.0F, 0.0F));

		PartDefinition cube_r93 = head2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(70, 39).addBox(-0.5F, -0.2258F, -0.7191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -3.1F, 1.525F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r94 = head2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(55, 68).mirror().addBox(-0.2438F, -0.2645F, -0.7295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2266F, 0.296F, -5.1708F, -0.0013F, -0.0862F, 0.2865F));

		PartDefinition cube_r95 = head2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(68, 51).mirror().addBox(-0.2438F, 0.1358F, -0.8154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.2266F, 0.296F, -5.1708F, 0.1733F, -0.0862F, 0.2865F));

		PartDefinition cube_r96 = head2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(68, 48).mirror().addBox(-0.467F, 0.4157F, -0.5748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(15, 68).mirror().addBox(-0.467F, 0.1157F, -0.5748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.1016F, 0.371F, -4.5708F, 0.1558F, -0.1448F, 0.2361F));

		PartDefinition cube_r97 = head2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(68, 45).mirror().addBox(-0.467F, -0.3262F, -0.496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.1016F, 0.371F, -4.5708F, -0.0187F, -0.1448F, 0.2361F));

		PartDefinition cube_r98 = head2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(10, 68).mirror().addBox(-0.2947F, 0.3251F, -0.7394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(68, 3).mirror().addBox(-0.2947F, 0.0251F, -0.7394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.3516F, 0.421F, -3.4208F, 0.1558F, -0.1448F, 0.1925F));

		PartDefinition cube_r99 = head2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(68, 0).mirror().addBox(-0.2947F, -0.3868F, -0.6738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3516F, 0.421F, -3.4208F, -0.0187F, -0.1448F, 0.1925F));

		PartDefinition cube_r100 = head2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(20, 69).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3033F, 0.7817F, -2.5019F, 0.0249F, -0.1448F, 0.0703F));

		PartDefinition cube_r101 = head2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(60, 66).mirror().addBox(-0.45F, -0.3015F, -0.5392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(65, 66).mirror().addBox(-0.45F, 0.0985F, -0.5392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.5891F, 0.7286F, -0.8669F, 0.0686F, -0.1448F, 0.0703F));

		PartDefinition cube_r102 = head2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(5, 69).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.4312F, 0.8958F, -1.6815F, 0.1558F, -0.1448F, 0.0703F));

		PartDefinition cube_r103 = head2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(69, 24).mirror().addBox(-0.45F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(25, 69).mirror().addBox(-0.45F, -0.6F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6772F, 1.0686F, -0.0816F, 0.1974F, -0.0079F, 0.0979F));

		PartDefinition cube_r104 = head2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-0.2F, -0.7224F, -1.7934F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -2.5F, 0.425F, 0.2269F, -0.1957F, -0.0449F));

		PartDefinition cube_r105 = head2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(69, 30).mirror().addBox(-0.25F, -0.2473F, -0.3189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -3.075F, 1.075F, 0.0087F, -0.144F, 0.0F));

		PartDefinition cube_r106 = head2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(69, 27).mirror().addBox(-0.25F, -0.3887F, 0.673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -3.075F, 1.075F, -0.144F, -0.144F, 0.0F));

		PartDefinition cube_r107 = head2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(30, 69).mirror().addBox(-0.25F, -0.2678F, 0.1792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -3.075F, 1.075F, -0.0131F, -0.144F, 0.0F));

		PartDefinition cube_r108 = head2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(69, 54).mirror().addBox(-0.25F, -1.2552F, -0.0022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -3.075F, 1.075F, -1.4355F, -0.144F, 0.0F));

		PartDefinition cube_r109 = head2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(35, 69).mirror().addBox(-0.5F, -0.68F, -0.2244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.4709F, 0.8546F, -0.9992F, 0.0F, 0.1222F));

		PartDefinition cube_r110 = head2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(50, 69).mirror().addBox(-0.2136F, -0.6346F, 0.1236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -3.075F, 1.075F, -1.0081F, -0.1437F, 0.0617F));

		PartDefinition cube_r111 = head2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(45, 69).mirror().addBox(-0.5F, -0.6393F, -0.5928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(40, 69).mirror().addBox(-0.5F, -0.2393F, -0.6928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.4709F, 0.8546F, -0.7723F, 0.0F, 0.1222F));

		PartDefinition cube_r112 = head2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(69, 36).mirror().addBox(-0.5F, -0.2687F, -0.185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.4709F, 0.8546F, -1.1301F, 0.0F, 0.1222F));

		PartDefinition cube_r113 = head2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(59, 24).mirror().addBox(-0.5F, -0.2146F, -0.184F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.4709F, 0.8546F, -0.5585F, 0.0F, 0.1222F));

		PartDefinition cube_r114 = head2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(59, 55).mirror().addBox(-0.5F, 1.0337F, -0.056F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false)
				.texOffs(69, 33).mirror().addBox(-0.5F, 2.4337F, 0.044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.4709F, 0.8546F, -0.6501F, 0.0F, 0.1222F));

		PartDefinition cube_r115 = head2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-0.2497F, -0.5603F, -3.7273F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.001F, 0.4809F, 2.824F, 0.0348F, -0.0349F, 0.0018F));

		PartDefinition cube_r116 = head2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(69, 57).mirror().addBox(-0.5F, 1.9098F, -2.1818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -2.4709F, 0.8546F, 0.1789F, 0.0F, 0.1222F));

		PartDefinition cube_r117 = head2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(50, 66).mirror().addBox(-0.2206F, -0.1593F, -2.1362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(37, 51).mirror().addBox(-0.2206F, -0.1593F, -3.6362F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-0.9004F, 0.38F, -0.6599F, -0.1833F, -0.1396F, 0.0F));

		PartDefinition cube_r118 = head2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(51, 49).mirror().addBox(-0.2206F, -0.3396F, -1.7035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2456F)).mirror(false), PartPose.offsetAndRotation(-0.9004F, 0.38F, -0.6599F, -0.0524F, -0.1396F, 0.0F));

		PartDefinition cube_r119 = head2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(30, 51).mirror().addBox(-0.5F, -0.4015F, -0.3759F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(45, 66).mirror().addBox(-0.5F, -0.4015F, 1.1241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1291F, -5.7454F, 0.0785F, -0.0873F, 0.0F));

		PartDefinition cube_r120 = head2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(50, 31).mirror().addBox(-0.5F, -0.55F, -1.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.256F)).mirror(false), PartPose.offsetAndRotation(-0.1326F, -0.2747F, -4.2292F, 0.4625F, -0.0873F, 0.0F));

		PartDefinition cube_r121 = head2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(50, 35).mirror().addBox(-0.2206F, -1.5128F, 1.4437F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.9004F, 0.38F, -0.6599F, 2.6005F, -0.1396F, 0.0F));

		PartDefinition cube_r122 = head2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(35, 66).mirror().addBox(-0.5F, 1.5491F, 0.0084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1291F, -5.7454F, 1.6406F, -0.0873F, 0.0F));

		PartDefinition cube_r123 = head2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(60, 69).addBox(-0.5F, -0.1593F, -2.5233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -3.1F, 0.525F, 0.2225F, 0.0F, 0.0F));

		PartDefinition cube_r124 = head2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(52, 26).addBox(-1.1F, -0.7224F, -1.7934F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6F, -2.5F, 0.425F, 0.2225F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(0, 52).addBox(-0.8F, -0.7224F, -1.7934F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.6F, -2.5F, 0.425F, 0.2269F, 0.1957F, 0.0449F));

		PartDefinition cube_r126 = head2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(69, 57).addBox(-0.5F, 1.9098F, -2.1818F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.3F, -2.4709F, 0.8546F, 0.1789F, 0.0F, -0.1222F));

		PartDefinition cube_r127 = head2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(69, 54).addBox(-0.75F, -1.2552F, -0.0022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.55F, -3.075F, 1.075F, -1.4355F, 0.144F, 0.0F));

		PartDefinition cube_r128 = head2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(50, 69).addBox(-0.7864F, -0.6346F, 0.1236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.55F, -3.075F, 1.075F, -1.0081F, 0.1437F, -0.0617F));

		PartDefinition cube_r129 = head2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(45, 69).addBox(-0.5F, -0.6393F, -0.5928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(40, 69).addBox(-0.5F, -0.2393F, -0.6928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3F, -2.4709F, 0.8546F, -0.7723F, 0.0F, -0.1222F));

		PartDefinition cube_r130 = head2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(69, 36).addBox(-0.5F, -0.2687F, -0.185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(0.3F, -2.4709F, 0.8546F, -1.1301F, 0.0F, -0.1222F));

		PartDefinition cube_r131 = head2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(35, 69).addBox(-0.5F, -0.68F, -0.2244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3F, -2.4709F, 0.8546F, -0.9992F, 0.0F, -0.1222F));

		PartDefinition cube_r132 = head2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(69, 33).addBox(-0.5F, 2.4337F, 0.044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(59, 55).addBox(-0.5F, 1.0337F, -0.056F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(0.3F, -2.4709F, 0.8546F, -0.6501F, 0.0F, -0.1222F));

		PartDefinition cube_r133 = head2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(59, 24).addBox(-0.5F, -0.2146F, -0.184F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.3F, -2.4709F, 0.8546F, -0.5585F, 0.0F, -0.1222F));

		PartDefinition cube_r134 = head2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(69, 30).addBox(-0.75F, -0.2473F, -0.3189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.55F, -3.075F, 1.075F, 0.0087F, 0.144F, 0.0F));

		PartDefinition cube_r135 = head2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(30, 69).addBox(-0.75F, -0.2678F, 0.1792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.55F, -3.075F, 1.075F, -0.0131F, 0.144F, 0.0F));

		PartDefinition cube_r136 = head2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(69, 27).addBox(-0.75F, -0.3887F, 0.673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.55F, -3.075F, 1.075F, -0.144F, 0.144F, 0.0F));

		PartDefinition cube_r137 = head2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 37).addBox(-0.7503F, -0.5603F, -3.7273F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.001F, 0.4809F, 2.824F, 0.0348F, 0.0349F, -0.0018F));

		PartDefinition cube_r138 = head2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(25, 69).addBox(-0.55F, -0.6F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(69, 24).addBox(-0.55F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.6772F, 1.0686F, -0.0816F, 0.1974F, 0.0079F, -0.0979F));

		PartDefinition cube_r139 = head2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(20, 69).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3033F, 0.7817F, -2.5019F, 0.0249F, 0.1448F, -0.0703F));

		PartDefinition cube_r140 = head2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(5, 69).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4312F, 0.8958F, -1.6815F, 0.1558F, 0.1448F, -0.0703F));

		PartDefinition cube_r141 = head2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 69).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0314F, 0.7132F, -5.6453F, -0.4563F, 0.0F, 0.0F));

		PartDefinition cube_r142 = head2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(55, 68).addBox(-0.7562F, -0.2645F, -0.7295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2266F, 0.296F, -5.1708F, -0.0013F, 0.0862F, -0.2865F));

		PartDefinition cube_r143 = head2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(68, 51).addBox(-0.7562F, 0.1358F, -0.8154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.2266F, 0.296F, -5.1708F, 0.1733F, 0.0862F, -0.2865F));

		PartDefinition cube_r144 = head2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(68, 48).addBox(-0.533F, 0.4157F, -0.5748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(15, 68).addBox(-0.533F, 0.1157F, -0.5748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.1016F, 0.371F, -4.5708F, 0.1558F, 0.1448F, -0.2361F));

		PartDefinition cube_r145 = head2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(68, 45).addBox(-0.533F, -0.3262F, -0.496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1016F, 0.371F, -4.5708F, -0.0187F, 0.1448F, -0.2361F));

		PartDefinition cube_r146 = head2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(10, 68).addBox(-0.7053F, 0.3251F, -0.7394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(68, 3).addBox(-0.7053F, 0.0251F, -0.7394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.3516F, 0.421F, -3.4208F, 0.1558F, 0.1448F, -0.1925F));

		PartDefinition cube_r147 = head2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(68, 0).addBox(-0.7053F, -0.3868F, -0.6738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.3516F, 0.421F, -3.4208F, -0.0187F, 0.1448F, -0.1925F));

		PartDefinition cube_r148 = head2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(65, 66).addBox(-0.55F, 0.0985F, -0.5392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(60, 66).addBox(-0.55F, -0.3015F, -0.5392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5891F, 0.7286F, -0.8669F, 0.0686F, 0.1448F, -0.0703F));

		PartDefinition cube_r149 = head2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(51, 49).addBox(-0.7794F, -0.3396F, -1.7035F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2456F)), PartPose.offsetAndRotation(0.9004F, 0.38F, -0.6599F, -0.0524F, 0.1396F, 0.0F));

		PartDefinition cube_r150 = head2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(50, 66).addBox(-0.7794F, -0.1593F, -2.1362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(37, 51).addBox(-0.7794F, -0.1593F, -3.6362F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.9004F, 0.38F, -0.6599F, -0.1833F, 0.1396F, 0.0F));

		PartDefinition cube_r151 = head2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(45, 66).addBox(-0.5F, -0.4015F, 1.1241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(30, 51).addBox(-0.5F, -0.4015F, -0.3759F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.1291F, -5.7454F, 0.0785F, 0.0873F, 0.0F));

		PartDefinition cube_r152 = head2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(7, 51).addBox(-0.5F, -0.2964F, -1.7575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -0.85F, -4.675F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r153 = head2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(40, 66).addBox(-0.5F, -0.7962F, -0.2654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.0F, -1.125F, -3.25F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r154 = head2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(50, 35).addBox(-0.7794F, -1.5128F, 1.4437F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.9004F, 0.38F, -0.6599F, 2.6005F, 0.1396F, 0.0F));

		PartDefinition cube_r155 = head2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(35, 66).addBox(-0.5F, 1.5491F, 0.0084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.1291F, -5.7454F, 1.6406F, 0.0873F, 0.0F));

		PartDefinition cube_r156 = head2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(50, 31).addBox(-0.5F, -0.55F, -1.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.256F)), PartPose.offsetAndRotation(0.1326F, -0.2747F, -4.2292F, 0.4625F, 0.0873F, 0.0F));

		PartDefinition cube_r157 = head2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(23, 50).addBox(-0.5F, -0.7621F, -1.7527F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -1.3F, -3.175F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r158 = head2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(16, 50).addBox(-0.5F, -0.2964F, -0.2575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(0.0F, -0.85F, -4.675F, 0.5934F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0026F, 1.0625F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r159 = jaw.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(7, 55).mirror().addBox(-0.175F, -0.1669F, -1.945F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2554F, -3.1521F, 0.0785F, -0.0349F, 0.0F));

		PartDefinition cube_r160 = jaw.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(21, 54).mirror().addBox(0.425F, -1.4123F, -1.9329F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(71, 15).mirror().addBox(0.425F, -0.8873F, -0.9329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(21, 54).addBox(1.575F, -1.4123F, -1.9329F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F))
				.texOffs(71, 15).addBox(1.575F, -0.8873F, -0.9329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.5F, 1.0804F, -1.2521F, 0.2225F, 0.0F, 0.0F));

		PartDefinition cube_r161 = jaw.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(40, 72).mirror().addBox(-0.5825F, -0.7147F, -0.3902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(35, 72).mirror().addBox(-0.5825F, -0.7147F, -0.6902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.2557F, 0.2881F, -8.0407F, -1.3611F, -0.0974F, -0.3633F));

		PartDefinition cube_r162 = jaw.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(30, 72).mirror().addBox(-0.5F, -0.6142F, -0.4732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(25, 72).mirror().addBox(-0.5F, -0.6142F, -0.7732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.2557F, 0.3381F, -8.5407F, -1.2834F, -0.1264F, -0.3092F));

		PartDefinition cube_r163 = jaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(20, 72).mirror().addBox(-0.3844F, -0.5772F, -0.679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 72).mirror().addBox(-0.3844F, -0.5772F, -0.979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-0.2557F, 0.3131F, -9.2407F, -1.274F, -0.1849F, -0.4189F));

		PartDefinition cube_r164 = jaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0501F, 0.0053F, -10.7772F, -1.1039F, 0.0087F, 0.0F));

		PartDefinition cube_r165 = jaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(55, 71).mirror().addBox(-0.325F, -0.5017F, -0.7996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(71, 21).mirror().addBox(-0.325F, -0.5017F, -0.4996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2444F, 0.1483F, -10.1218F, -1.3319F, -0.0974F, -0.2954F));

		PartDefinition cube_r166 = jaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(54, 20).mirror().addBox(-0.2912F, -0.4256F, -1.3814F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3554F, -9.7521F, -0.2313F, 0.0087F, 0.0F));

		PartDefinition cube_r167 = jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(54, 16).mirror().addBox(-0.2912F, -0.268F, -1.3872F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.3554F, -9.7521F, -0.3709F, 0.0087F, 0.0F));

		PartDefinition cube_r168 = jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(14, 54).mirror().addBox(-0.2594F, -0.1128F, -1.6148F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3554F, -8.1521F, -0.1265F, -0.1658F, 0.0F));

		PartDefinition cube_r169 = jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(54, 12).mirror().addBox(-0.2594F, -0.2999F, -1.7058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3554F, -8.1521F, 0.0044F, -0.1658F, 0.0F));

		PartDefinition cube_r170 = jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(54, 8).mirror().addBox(-0.0633F, -0.0899F, -1.8918F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3554F, -6.3521F, -0.0611F, -0.1658F, 0.0F));

		PartDefinition cube_r171 = jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(11, 37).mirror().addBox(-0.45F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3953F, 0.4438F, -5.4274F, 0.0262F, -0.0785F, -0.0011F));

		PartDefinition cube_r172 = jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(-0.175F, -0.0716F, -3.2957F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2554F, -3.1521F, 0.0262F, -0.0349F, 0.0F));

		PartDefinition cube_r173 = jaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(44, 53).mirror().addBox(-0.175F, 0.4247F, -3.2461F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2554F, -3.1521F, -0.1309F, -0.0349F, 0.0F));

		PartDefinition cube_r174 = jaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(53, 43).mirror().addBox(-0.175F, 0.2093F, -1.6298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.2554F, -3.1521F, 0.0218F, -0.0349F, 0.0F));

		PartDefinition cube_r175 = jaw.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(71, 18).mirror().addBox(0.425F, -0.9003F, -0.8841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(71, 18).addBox(1.575F, -0.9003F, -0.8841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.5F, 1.2804F, -2.0771F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r176 = jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(15, 71).mirror().addBox(0.425F, -0.8975F, -0.8608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(15, 71).addBox(1.575F, -0.8975F, -0.8608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-1.5F, 0.8804F, -0.5521F, 0.2923F, 0.0F, 0.0F));

		PartDefinition cube_r177 = jaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(71, 12).mirror().addBox(0.425F, -0.575F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(71, 12).addBox(1.575F, -0.575F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.5F, 0.5554F, -0.6021F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r178 = jaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(10, 71).mirror().addBox(0.425F, -0.1491F, -0.9385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(10, 71).addBox(1.575F, -0.1491F, -0.9385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-1.5F, -0.2446F, -1.0021F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r179 = jaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(71, 9).mirror().addBox(0.425F, -0.575F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(71, 9).addBox(1.575F, -0.575F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.5F, 0.5554F, -0.6021F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r180 = jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(7, 55).addBox(-0.825F, -0.1669F, -1.945F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9F, 0.2554F, -3.1521F, 0.0785F, 0.0349F, 0.0F));

		PartDefinition cube_r181 = jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(40, 72).addBox(-0.4175F, -0.7147F, -0.3902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(35, 72).addBox(-0.4175F, -0.7147F, -0.6902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.2557F, 0.2881F, -8.0407F, -1.3611F, 0.0974F, 0.3633F));

		PartDefinition cube_r182 = jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(30, 72).addBox(-0.5F, -0.6142F, -0.4732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(25, 72).addBox(-0.5F, -0.6142F, -0.7732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.2557F, 0.3381F, -8.5407F, -1.2834F, 0.1264F, 0.3092F));

		PartDefinition cube_r183 = jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(20, 72).addBox(-0.6156F, -0.5772F, -0.679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 72).addBox(-0.6156F, -0.5772F, -0.979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.2557F, 0.3131F, -9.2407F, -1.274F, 0.1849F, 0.4189F));

		PartDefinition cube_r184 = jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0501F, 0.0053F, -10.7772F, -1.1039F, -0.0087F, 0.0F));

		PartDefinition cube_r185 = jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(55, 71).addBox(-0.675F, -0.5017F, -0.7996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(71, 21).addBox(-0.675F, -0.5017F, -0.4996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2444F, 0.1483F, -10.1218F, -1.3319F, 0.0974F, 0.2954F));

		PartDefinition cube_r186 = jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(54, 20).addBox(-0.7088F, -0.4256F, -1.3814F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.3F, 0.3554F, -9.7521F, -0.2313F, -0.0087F, 0.0F));

		PartDefinition cube_r187 = jaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(54, 16).addBox(-0.7088F, -0.268F, -1.3872F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3F, 0.3554F, -9.7521F, -0.3709F, -0.0087F, 0.0F));

		PartDefinition cube_r188 = jaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(14, 54).addBox(-0.7406F, -0.1128F, -1.6148F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.3554F, -8.1521F, -0.1265F, 0.1658F, 0.0F));

		PartDefinition cube_r189 = jaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(54, 12).addBox(-0.7406F, -0.2999F, -1.7058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.5F, 0.3554F, -8.1521F, 0.0044F, 0.1658F, 0.0F));

		PartDefinition cube_r190 = jaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(54, 8).addBox(-0.9367F, -0.0899F, -1.8918F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9F, 0.3554F, -6.3521F, -0.0611F, 0.1658F, 0.0F));

		PartDefinition cube_r191 = jaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(11, 37).addBox(-0.55F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3953F, 0.4438F, -5.4274F, 0.0262F, 0.0785F, 0.0011F));

		PartDefinition cube_r192 = jaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(51, 53).addBox(-0.825F, -0.0716F, -3.2957F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.9F, 0.2554F, -3.1521F, 0.0262F, 0.0349F, 0.0F));

		PartDefinition cube_r193 = jaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(44, 53).addBox(-0.825F, 0.4247F, -3.2461F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9F, 0.2554F, -3.1521F, -0.1309F, 0.0349F, 0.0F));

		PartDefinition cube_r194 = jaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(53, 43).addBox(-0.825F, 0.2093F, -1.6298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.9F, 0.2554F, -3.1521F, 0.0218F, 0.0349F, 0.0F));

		return LayerDefinition.create(meshdefinition, 76, 76);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}